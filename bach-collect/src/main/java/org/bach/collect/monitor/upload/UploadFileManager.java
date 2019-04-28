package org.bach.collect.monitor.upload;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class UploadFileManager {

	private static Queue<UploadFileInfo> uFileInfos = new LinkedList<UploadFileInfo>();
	
	private static int maxQueue = 10;

	public static final String UPLAOD_BASE = "/test";

	public String getUpdatePath(File file) {
		Date modify = new Date(file.lastModified());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(modify);
		Path path = Paths.get(UPLAOD_BASE, format, file.getName());
		return path.toString();
	}

	public static Queue<UploadFileInfo> getuFileInfos() {
		return uFileInfos;
	}

	public static void setuFileInfos(Queue<UploadFileInfo> uFileInfos) {
		UploadFileManager.uFileInfos = uFileInfos;
	}

	public static synchronized void addFileInfo(UploadFileInfo fileInfo) {
		checkQueueAndClean();
		uFileInfos.offer(fileInfo);
	}
	
	public static void checkQueueAndClean() {
		while (uFileInfos.size() >= maxQueue) {
			uFileInfos.poll();
		}
	}
}
