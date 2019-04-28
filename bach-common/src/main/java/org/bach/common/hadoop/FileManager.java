package org.bach.common.hadoop;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public class FileManager {

	private static final Logger LOG = BachLogger.getLogger(FileManager.class);

	private static final String HDFS_HOME = "hdfs://test02:8020";

	public static final String HDFS_USER = "hdfs";

	private URI url;

	private FileSystem fs;

	public static FileManager build() {
		FileManager fm = new FileManager();
		fm.init();
		return fm;
	}

	public void init() {
		try {
			Configuration conf = new Configuration();
			url = new URI(HDFS_HOME);
			fs = FileSystem.get(url, conf, HDFS_USER);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void copyFromLocalFile(Path src, Path dst) throws IOException {
		fs.copyFromLocalFile(src, dst);
		LOG.info("copy from local {} to {}", src, dst);
	}

	public static void main(String[] args) {
		FileManager fs = FileManager.build();
		Path src = new Path("D:\\test\\1.txt");
		Path dst = new Path("/test/2");
		try {
			fs.copyFromLocalFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
//			RemoteIterator<LocatedFileStatus> files = fs.listFiles(f , false);
//			while(files.hasNext()) {
//				System.out.println(files.next());
//			}
	}
}
