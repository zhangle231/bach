package org.bach.collect.monitor;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public abstract class FileKeeper implements Runnable {

	private static final Logger LOG = BachLogger.getLogger(FileKeeper.class);

	private Object lock = new Object();

	private int addFileCnt;

	private int rmFileCnt;

	private List<File> archives = new ArrayList<File>();

	private List<File> removeFs = new ArrayList<File>();

	public abstract FileHandler getFileHandler();

	@Override
	public void run() {
		int showStatCnt = 600;
		while (true) {
			// process
			process();
			// showStat
			if (showStatCnt-- == 0) {
				showStat();
				showStatCnt = 600;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void addFile(File file) {
		synchronized (lock) {
			if (!archives.contains(file)) {
				archives.add(file);
				addFileCnt++;
				LOG.trace("add file:{}", file);
			}
		}
	}

	public void process() {
		synchronized (lock) {
			Queue<File> q = new LinkedList<>();
			Iterator<File> iterator = archives.iterator();
			while (iterator.hasNext()) {
				File file = iterator.next();
				iterator.remove();
				removeFs.add(file);
				rmFileCnt++;
				LOG.trace("remove file:{}", file);
				q.offer(file);
			}
			KeepHandler handler = new KeepHandler(q);
			new Thread(handler).start();
		}
	}

	private class KeepHandler implements Runnable {
		Queue<File> queue = new LinkedList<>();
		FileHandler h;

		public KeepHandler(Queue<File> queue) {
			this.queue = queue;
			this.h = FileKeeper.this.getFileHandler();
		}

		@Override
		public void run() {
			File poll;
			while ((poll = queue.poll()) != null) {
//				LOG.debug("execute file:{}", poll);
				h.execute(poll);
			}
		}
	}

	public void showStat() {
		LOG.debug("addFileCnt:{}", addFileCnt);
		LOG.debug("rmFileCnt:{}", rmFileCnt);
		LOG.debug("archives size:{}", archives.size());
		LOG.debug("removeFs size:{}", removeFs.size());
	}

}
