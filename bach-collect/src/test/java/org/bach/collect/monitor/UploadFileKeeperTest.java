package org.bach.collect.monitor;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

import junit.framework.TestCase;

public class UploadFileKeeperTest extends TestCase {

	private static final Logger LOG = BachLogger.getLogger(UploadFileKeeperTest.class);

	public void testRun() {
		UploadFileKeeper uploadFileKeeper = new UploadFileKeeper();
		Thread t = new Thread(uploadFileKeeper);
		t.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		for (int i = 0; i < 100; i++) {
			uploadFileKeeper.addFile(new File("test"));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void testMain() {
		LOG.debug("test");
		final FileKeeper fk = new UploadFileKeeper();

		final List<File> beginFs = new ArrayList<File>();
		for (int i = 0; i < 300; i++) {
			beginFs.add(new File("./" + i + ".txt"));
		}

		LOG.debug("all file size:{}", beginFs.size());

		Thread[] ts = new Thread[1];
		for (int i = 0; i < 1; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					while (beginFs.size() > 0) {
						synchronized (beginFs) {
							File file = beginFs.remove(0);
							fk.addFile(file);
							LOG.debug("get file [{}] from beginFs.", file);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			});
			thread.start();
			ts[i] = thread;
		}

		Thread[] ts2 = new Thread[1];

		for (int i = 0; i < 1; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						fk.process();
						fk.showStat();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			thread.start();
			ts2[i] = thread;
		}

		for (Thread[] t : Arrays.asList(ts, ts2)) {
			for (Thread tt : t) {
				try {
					tt.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
