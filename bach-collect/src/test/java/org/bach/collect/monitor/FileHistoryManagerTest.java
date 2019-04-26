package org.bach.collect.monitor;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

public class FileHistoryManagerTest extends TestCase {

	public void testSaveDB() {
		FileHistoryManager historyManager = FileHistoryManager.getInstance();

		for (int i = 0; i < 100; i++) {
			File tempFile = null;
			try {
				tempFile = File.createTempFile("history", null);
				historyManager.addHistory(tempFile);
				historyManager.saveDB();
				historyManager.reloadDB();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (tempFile != null)
					tempFile.delete();
			}
		}
	}
}
