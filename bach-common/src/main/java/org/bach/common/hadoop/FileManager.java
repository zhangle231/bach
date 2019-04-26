package org.bach.common.hadoop;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class FileManager {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		try {
			URI url = new URI("hdfs://test02:8020");
			FileSystem fs = FileSystem.get(url, conf, "hdfs");
			Path f = new Path("/test");

			fs.mkdirs(f);

			Path src = new Path("D:\\test\\1.txt");
			Path dst = new Path("/test/1");
			fs.copyFromLocalFile(src, dst);
//			RemoteIterator<LocatedFileStatus> files = fs.listFiles(f , false);
//			while(files.hasNext()) {
//				System.out.println(files.next());
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
