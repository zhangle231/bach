package org.bach.common.hadoop.mapreduce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileClean {
	public static final char SPLIT = 27;
//	private static final Logger LOG = BachLogger.getLogger(FileClean.class);

	public class FileInfo {
		String fileName;
		String content;

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	public static void main(String[] args) throws Throwable {
		for (int i = 0; i < 164; i++) {
			System.out.println("msg_" + i + " string,");
		}
		
		
		char c = '\033';
		String tmp = String.valueOf(c);
		byte[] bytes = tmp.getBytes("UTF-8");
		byte[] newline = "\n".getBytes("UTF-8");
		
		System.out.println(tmp);
		
		String line = "ogg_PGI_LLREGISTER_2019-04-28_08-58-17.dsv";
		
//		Pattern pattern = Pattern.compile("(.*)_\\d4-\\d2-\\d2_\\d2-\\d2-\\d2");
		Pattern pattern = Pattern.compile("ogg_(.*)_\\d{4}-\\d{2}-\\d{2}_\\d{2}-\\d{2}-\\d{2}");
		
		Matcher matcher = pattern.matcher(line);
		
		if (matcher.find()) {
			String string = matcher.group(1);
			System.out.println(string);
		}
		
		File f = new File("D:\\code\\bach\\bach-common\\target\\a.txt");
		FileClean fc = new FileClean();
		try {
			FileInfo fileInfo = fc.parseFile(f);
			System.out.println(fileInfo);
//			LOG.info(fileInfo);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public FileInfo parseFile(String line) {
		String fileName = null;
		StringBuffer content = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < line.length(); i++) {
			char charAt = line.charAt(i);
			if (charAt == '|') {
				fileName = sb.toString();
				sb.setLength(0);
//				LOG.trace("fileName:[" + fileName + "]");
				continue;
			}
			if (charAt == '\t' && line.charAt(i + 1) == '1') {
//				LOG.trace("line: [" + sb.toString() + "\n]");
				content.append(sb);
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
				if (flat && line.charAt(i + 2) == SPLIT) {
					sb.append(charAt);
//					LOG.trace("line: [" + sb.toString() + "]");
					content.append(sb);
					sb.setLength(0);
					continue;
				}
				if (!flat) {
//					LOG.trace(charAt);
				}
				continue;
			}
			sb.append(charAt);
		}

		FileInfo fi = new FileInfo();
		fi.setFileName(fileName);
		fi.setContent(content.toString());
		return fi;
	}

	public FileInfo parseFile(byte[] buff) throws Throwable {
		String line = new String(buff, "utf-8");
		return parseFile(line);
	}

	public FileInfo parseFile(File f) throws Throwable {
		long length = f.length();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);

			byte[] b = new byte[(int) length];

			fis.read(b);

			return parseFile(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
		}
		return null;
	}

}
