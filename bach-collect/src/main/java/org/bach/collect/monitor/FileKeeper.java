package org.bach.collect.monitor;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public class FileKeeper {
	
	private static final Logger LOG = BachLogger.getLogger(FileKeeper.class);
	
	private Object lock;
	
	private List<File> archives;
	
	public void addFile(File file) {
		archives.add(file);
	}
	
	public void moveFileToStore() {
		
	}

	public static void main(String[] args) {

	}

}
