package org.bach.common.hadoop.mapreduce;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class FileCleanReduce2 extends Reducer<Text, Text, Text, Text> {

	private MultipleOutputs<Text, Text> mos;

	@Override
	protected void cleanup(Reducer<Text, Text, Text, Text>.Context context) throws IOException, InterruptedException {
		mos.close();
	}

	@Override
	protected void reduce(Text key, Iterable<Text> values, Reducer<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		String split = String.valueOf((char) 0x1b);
		
		class RowInfo {
			String fileName;
			String raw;
			String optype;
			String serial;
			String no_b;
			String no_a;
		}
		
		Map<String,RowInfo> row = new HashMap<>();
		for (Text value : values) {

			String file = value.toString();
			String fileName = file.substring(0, file.indexOf(split));
			String fileContext = file.substring(file.indexOf(split) + 1);


			for (String line : fileContext.split("\n")) {
				
				String[] fs = line.split(split);
				
				if (fs.length < 5) continue;
				
				String optype = fs[0];
				String serial = fs[2];
				String no_b = fs[3];
				String no_a = fs[4];
				

				String rNo;
				if (optype == "I") {
					rNo = no_a;
				} else {
					rNo = no_b;
				}
				String rowId = key.toString() + rNo;
							
//				line = optype + split
//						+ serial + split
//						+ rNo + split;
//				
				RowInfo curr = new RowInfo();
				curr.optype = optype;
				curr.serial = serial;
				curr.no_b = no_b;
				curr.no_a = no_a;
				curr.fileName = fileName;
				curr.raw = line;
				
				RowInfo info = row.get(rowId);
				if (info == null) {
					row.put(rowId, curr);
				} else {
					if (Long.parseLong(curr.serial) > Long.parseLong(info.serial)) {
						info = curr;
					}
				}
				
				String tmp = key.toString();
				String basepath = makeBasePath(tmp);
//				mos.write(key, new Text(line), basepath);
//				line = fileName + String.valueOf((char) 0x1b) + line;
//				mos.write(key, new Text(line), key.toString() + "/dat");
			}
		}
		
		for (String k :row.keySet()) {
			RowInfo rowInfo = row.get(k);
			String line = rowInfo.fileName 
						+ split  + rowInfo.serial
						+ split  + rowInfo.optype
						+ split  + rowInfo.no_b
						+ split  + rowInfo.no_a;
			line = rowInfo.fileName + split + rowInfo.raw;
			mos.write(key, new Text(line), key.toString() + "/dat");
		}
	}

	public String makeBasePath(String key) {
		Pattern pattern = Pattern.compile("ogg_(.*)_\\d{4}-\\d{2}-\\d{2}_\\d{2}-\\d{2}-\\d{2}");
		if (key != null) {
			Matcher matcher = pattern.matcher(key);
			if (matcher.find()) {
				String string = matcher.group(1);
				return string + "/";
			}
		}
		return "error/";
	}

	@Override
	protected void setup(Reducer<Text, Text, Text, Text>.Context context) throws IOException, InterruptedException {
		mos = new MultipleOutputs<Text, Text>(context);
	}
}
