package org.bach.collect.monitor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public class FileHistoryManager {

	private static final Logger LOG = BachLogger.getLogger(FileHistoryManager.class);

	private static FileHistoryManager instance;

	private FileHistoryManager() {
	}

	private Map<String, Date> historyFileMap;

	private String historyDBPath = "history.dat";

	public static FileHistoryManager getInstance() {
		if (instance == null) {
			LOG.debug("create FileHistoryManager.");
			instance = new FileHistoryManager();
			instance.loadDB();
		}
		return instance;
	}

	public class historyFileEntity {
		String fileName;
		Date modifyDate;
	}

	public void loadDB() {
		historyFileMap = new HashMap<String, Date>();
//		reloadDB();
	}

	public void reloadDB() {
		File f = new File(historyDBPath);
		if (f.exists()) {
			try {
				DataInputStream dis = new DataInputStream(new FileInputStream(f));
				int size = dis.readInt();
				LOG.debug("size:{}",size);
				for (int i = 0; i < size; i++) {
					String key = dis.readUTF();
					Long time = dis.readLong();
					LOG.debug("key:{},value:{}", key, time);
				}
				dis.close();
			} catch (FileNotFoundException e) {
				LOG.error(e.getMessage());
			} catch (IOException e) {
				LOG.error(e.getMessage());
			}
		}
	}

	public void saveDB() {
		LOG.info("save db.");
		File f = new File(historyDBPath);
		if (f.exists()) {
			if (!f.delete()) {
				throw new RuntimeException("db delete failure.");
			}
		}
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
			dos.writeInt(historyFileMap.size());
			LOG.debug("size:{}",historyFileMap.size());
			for (String key : historyFileMap.keySet()) {
				dos.writeUTF(key);
				dos.writeLong(historyFileMap.get(key).getTime());
				LOG.debug("key:{},value:{}", key, historyFileMap.get(key).getTime());
			}
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			LOG.error(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void flushDB() {

	}

	public void addHistory(File f) {
		historyFileMap.put(f.getAbsolutePath(), new Date(f.lastModified()));
	}
}
