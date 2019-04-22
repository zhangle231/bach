package org.bach.collect.monitor;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public class FileMonitor extends Thread {

	private String monitorPath = "D:\\test";

	private static final Logger LOG = BachLogger.getLogger(FileMonitor.class);

	@Override
	public void run() {
		
		File root = new File(monitorPath);
		
		if (!root.exists()) {
			throw new RuntimeException("root path is not exist.");
		}
		
		/*
		for (int i = 0; i < 1000000; i++) {
			File tmp = new File(root.getPath() + "/file_" + i);
			try {
				tmp.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			LOG.debug("create file:{}" , tmp.getAbsolutePath());
		}
		*/
		
		Map<String,Long> fileMap = new HashMap<>();
		LOG.debug("init file map.");
		fileMap.clear();
		for(File f : root.listFiles()) {
			fileMap.put(f.getAbsolutePath(), f.lastModified());
		}
		LOG.debug("init file map end.");
		
		while (true) {
			File[] files = root.listFiles();
			LOG.debug("get file count:{}" , files.length);
			
			for(File newFile : files) {
				Long modify = fileMap.get(newFile.getAbsolutePath());
				if (modify == null) {
					LOG.debug("new file.");
				}else if (modify != newFile.lastModified()) {
					LOG.debug("file modify.");
				}
				fileMap.put(newFile.getAbsolutePath(), newFile.lastModified());
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		FileMonitor fileMonitor = new FileMonitor();
		fileMonitor.start();
	}

}
