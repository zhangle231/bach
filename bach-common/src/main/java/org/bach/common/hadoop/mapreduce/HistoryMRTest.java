package org.bach.common.hadoop.mapreduce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HistoryMRTest {

	static String split = String.valueOf((char) 0x1b);

	public static void main(String[] args) throws Throwable {
		String path = "d:\\code\\bach\\bach-collect\\target\\aaa.txt";
		File f = new File(path);
		if (!f.exists()) {
			System.out.println("not exists.");
		}

		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;

		class LineInfo {
			long serial;
			String raw;
			String[] fields;
			int keyIndex;
			String table;
			String optype;
			String key;

			public LineInfo(long serial, String raw, int keyIndex) {
				super();
				this.serial = serial;
				this.raw = raw;
				this.keyIndex = keyIndex;
				fields = raw.split(split);
			}

			public long getSerial() {
				return serial;
			}

			public void setSerial(long serial) {
				this.serial = serial;
			}

			public String getRaw() {
				return raw;
			}

			public void setRaw(String raw) {
				this.raw = raw;
			}

			public int getKeyIndex() {
				return keyIndex;
			}

			public void setKeyIndex(int keyIndex) {
				this.keyIndex = keyIndex;
			}

			public String getTable() {
				String tmp = fields[0];
				Pattern pattern = Pattern.compile("ogg_PGI_([^_]*)_");
				Matcher matcher = pattern.matcher(tmp);
				if (matcher.find()) {
					return matcher.group(1);
				}
				return null;
			}

			public String getOptype() {
				return optype;
			}

			public void setOptype(String optype) {
				this.optype = optype;
			}

			public String getKey() {
				return fields[keyIndex];
			}

		}

		List<LineInfo> list = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			String[] fields = line.split(split);
			String filePath = fields[0];
			String optype = fields[1];
			String optime = fields[2];
			long serial = Long.parseLong(fields[3]);
			LineInfo linfo = new LineInfo(serial, line, 13);
			list.add(linfo);
		}

		Comparator<LineInfo> LineInfoComp = new Comparator<LineInfo>() {
			@Override
			public int compare(LineInfo o1, LineInfo o2) {
				return (int) (o1.serial - o2.serial);
			}
		};

		Collections.sort(list, LineInfoComp);

		LineInfo info = Collections.max(list, LineInfoComp);

		System.out.println(info.serial + "-" + info.getTable() + "-" + info.getKey() + "-" + info.raw);

		for (LineInfo lineInfo : list) {
			System.out.println(
					lineInfo.serial + "-" + lineInfo.getTable() + "-" + lineInfo.getKey() + "-" + lineInfo.raw);
		}
	}

}
