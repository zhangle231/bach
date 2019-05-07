package org.bach.common.hadoop.mapreduce;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class FileCleanReduce extends Reducer<Text, Text, Text, Text> {

	private MultipleOutputs<Text, Text> mos;

	@Override
	protected void cleanup(Reducer<Text, Text, Text, Text>.Context context) throws IOException, InterruptedException {
		mos.close();
	}

	@Override
	protected void reduce(Text key, Iterable<Text> values, Reducer<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		for (Text value : values) {
			for (String line : value.toString().split("\n")) {
				String tmp = key.toString();
				String basepath = makeBasePath(tmp);
				mos.write(key, new Text(line), basepath);
			}
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
