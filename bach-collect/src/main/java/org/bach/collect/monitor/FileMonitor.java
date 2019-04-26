package org.bach.collect.monitor;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.bach.collect.CollectConfigure;
import org.bach.common.log.BachLogger;

public class FileMonitor extends Thread {

	private CollectConfigure collectConfigure = CollectConfigure.getInstance();

	private String monitorPath = collectConfigure.getProperty("collect.monitorPath");

	private static final Logger LOG = BachLogger.getLogger(FileMonitor.class);

	private UploadFileKeeper ufk = new UploadFileKeeper();

	private MoveFileKeeper mfk = new MoveFileKeeper();

	@Override
	public void run() {

		// start ukf
		Thread ufkt = new Thread(ufk);
		ufkt.start();

		// start mfk
		Thread mfkt = new Thread(mfk);
		mfkt.start();

		File root = new File(monitorPath);

		if (!root.exists()) {
			throw new RuntimeException("root path is not exist.");
		}

		/*
		 * for (int i = 0; i < 1000000; i++) { File tmp = new File(root.getPath() +
		 * "/file_" + i); try { tmp.createNewFile(); } catch (IOException e) {
		 * e.printStackTrace(); } LOG.debug("create file:{}" , tmp.getAbsolutePath()); }
		 */

		Map<String, Long> fileMap = new HashMap<>();
		LOG.debug("init file map.");
		fileMap.clear();
		for (File f : root.listFiles()) {
			fileMap.put(f.getAbsolutePath(), f.lastModified());
		}
		LOG.debug("init file map end.");

		while (true) {
			File[] files = root.listFiles();
			LOG.debug("get file count:{}", files.length);
			for (File newFile : files) {
				Long modify = fileMap.get(newFile.getAbsolutePath());
				if (modify == null) {
					LOG.debug("new file:{}", newFile.getAbsoluteFile());
					ufk.addFile(newFile);
				} else if (modify != newFile.lastModified()) {
					LOG.debug("modify file:{}", newFile.getAbsoluteFile());
				} else if (modify == newFile.lastModified()) {
					// 当文件不变时，判断是否移动
					mfk.addFile(newFile);
					continue;
				} else {
					LOG.debug("error ++++++++++");
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
