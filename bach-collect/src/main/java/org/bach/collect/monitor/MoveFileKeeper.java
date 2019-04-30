package org.bach.collect.monitor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;

import org.apache.logging.log4j.Logger;
import org.bach.collect.CollectConfigure;
import org.bach.common.log.BachLogger;

public class MoveFileKeeper extends FileKeeper implements FileHandler {

	private static final Logger LOG = BachLogger.getLogger(MoveFileKeeper.class);

	private static final String historyPath = CollectConfigure.getInstance().getProperty("collect.historyPath");

	private static final int BEFORE_DAY = -5;

	@Override
	public FileHandler getFileHandler() {
		return this;
	}

	@Override
	public void execute(File file) {
		File historyFile = new File(historyPath + File.separator + file.getName());
		long fileSize = file.length();
		if (file.isFile() && checkModifyDate(file)) {
			try {
				LOG.debug("move file {} - size {} to file {}", file, fileSize, historyFile.getAbsoluteFile());
				Files.move(file.toPath(), historyFile.toPath());
			} catch (IOException e) {
				e.printStackTrace();
				LOG.error(e.getMessage());
			}
		}
	}

	public static boolean checkModifyDate(File file) {
		if (!file.exists()) {
			LOG.error("not exist file:{}", file.getAbsoluteFile());
			return false;
		}
		long lastModified = file.lastModified();
//		SimpleDateFormat instance = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		String string = instance.format(new Date(lastModified));
//		LOG.debug("check file:{} lastModified:{}-{}", file.getAbsoluteFile(), string, lastModified);

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, BEFORE_DAY);

//		string = instance.format(calendar.getTime());
//		LOG.debug("now:{}", string);

		return (calendar.getTime().after((new Date(lastModified))));
	}
}
