package org.bach.collect.monitor;

import java.io.File;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public class UploadFileKeeper  extends FileKeeper implements FileHandler{
	
	private static final Logger LOG = BachLogger.getLogger(UploadFileKeeper.class);

	@Override
	public FileHandler getFileHandler() {
		return this;
	}

	@Override
	public void execute(File file) {
		LOG.debug("upload file:{} to {}", file, null);
	}

}
