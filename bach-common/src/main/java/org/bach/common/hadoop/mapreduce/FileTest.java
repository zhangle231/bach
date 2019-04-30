package org.bach.common.hadoop.mapreduce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTest {

	public static void main(String[] args) {

		File f = new File("D:\\code\\bach\\bach-common\\target\\a.txt");

		long length = f.length();

		char split = 27;

		try {
			FileInputStream fis = new FileInputStream(f);

			byte[] b = new byte[(int) length];

			fis.read(b);

			String line = new String(b, "utf-8");

			String fileName;
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < line.length(); i++) {
				char charAt = line.charAt(i);
				if (charAt == '|') {
					fileName = sb.toString();
					sb.setLength(0);
					System.out.println("fileName:[" + fileName + "]");
					continue;
				}
				if (charAt == '\t' && line.charAt(i + 1) == '1') {
					System.out.println("line: [" + sb.toString() + "\n]");
					sb.setLength(0);
					i++;
					continue;
				}
				if (charAt == '\r') {
					continue;
				}
				if (charAt == '\n') {
					char[] tmp = { 'I', 'U', 'D', 'K' };
					boolean flat = false;
					if (i >= line.length() - 1) {
						continue;
					}
					for (char t : tmp) {
						if (line.charAt(i + 1) == t) {
							flat = true;
							break;
						}
					}
					if (flat && line.charAt(i + 2) == split) {
						sb.append(charAt);
						System.out.println("line: [" + sb.toString() + "]");
						sb.setLength(0);
						continue;
					}
					if (!flat) {
//						System.out.println(charAt);
					}
					continue;
				}
				sb.append(charAt);
			}

			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
