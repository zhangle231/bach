package org.bach.collect.monitor.upload;

import java.util.Queue;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

import junit.framework.TestCase;

public class UploadFileManagerTest extends TestCase {

	private static final Logger LOG = BachLogger.getLogger(UploadFileManagerTest.class);

	private UploadFileManager ufm = new UploadFileManager();

	public void test() {
		Thread[] ts = new Thread[1];
		for (int i = 0; i < 1; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 100; i++) {
						UploadFileInfo fileInfo = new UploadFileInfo();
						fileInfo.setFileName("file-" + Thread.currentThread().getName() + "-" + i);
						UploadFileManager.addFileInfo(fileInfo);
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			t.setName("tid-" + i);
			t.start();
			ts[i] = t;
		}

		for (int i = 0; i < 1; i++) {
			try {
				ts[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		int nFiles = 0;
		Queue<UploadFileInfo> getuFileInfos = UploadFileManager.getuFileInfos();
		for (UploadFileInfo f : getuFileInfos) {
			LOG.debug(f.getFileName());
			nFiles++;
		}
		LOG.debug("nFiles:{}", nFiles);
	}

}
