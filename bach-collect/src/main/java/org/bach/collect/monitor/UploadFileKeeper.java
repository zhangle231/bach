package org.bach.collect.monitor;

import java.io.File;
import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.logging.log4j.Logger;
import org.bach.collect.monitor.upload.UploadFileManager;
import org.bach.common.hadoop.FileManager;
import org.bach.common.log.BachLogger;

public class UploadFileKeeper extends FileKeeper implements FileHandler {

	private static final Logger LOG = BachLogger.getLogger(UploadFileKeeper.class);

	private UploadFileManager ufm = new UploadFileManager();

	private FileManager fm = FileManager.build();

	@Override
	public FileHandler getFileHandler() {
		return this;
	}

	@Override
	public void execute(File file) {
		String dstPath = ufm.getUpdatePath(file);
		try {
			fm.copyFromLocalFile(new Path(file.getAbsolutePath()), new Path(dstPath));
			LOG.debug("upload file:{} to {}", file, dstPath);
		} catch (IllegalArgumentException | IOException e) {
			LOG.error(e.getMessage());
			LOG.error("can not upload file:{} to {}", file, dstPath);
		}
	}
}
