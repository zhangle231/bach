package org.bach.collect.monitor;

import java.io.File;

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
		
		while (true) {
			LOG.debug("check file.");
			File[] files = root.listFiles();
			LOG.debug("get file count:{}" , files.length);
		}
	}

	public static void main(String[] args) {
		FileMonitor fileMonitor = new FileMonitor();
		fileMonitor.start();
	}

}
