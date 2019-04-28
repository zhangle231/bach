package org.bach.collect.monitor;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.bach.collect.monitor.upload.UploadFileManager;
import org.bach.common.log.BachLogger;

import junit.framework.TestCase;

public class UploadFileManagerTest extends TestCase {

	private static final Logger LOG = BachLogger.getLogger(UploadFileKeeperTest.class);

	private UploadFileManager ufm = new UploadFileManager();

	public void testUploadFileManager() {
		File tempFile;
		try {
			for (int i = 0; i < 100; i++) {
				tempFile = File.createTempFile("upload", null);
				String path = ufm.getUpdatePath(tempFile);
				LOG.debug(path);
				tempFile.deleteOnExit();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
