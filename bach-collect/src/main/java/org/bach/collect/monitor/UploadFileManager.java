package org.bach.collect.monitor;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UploadFileManager {
	
	public static final String UPLAOD_BASE = "/test";
	
	public String getUpdatePath(File file) {
		Date modify = new Date(file.lastModified());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(modify);
		Path path = Paths.get(UPLAOD_BASE, format, file.getName());
		return path.toString();
	}

}
