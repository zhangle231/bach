package org.bach.collect;

import org.bach.collect.monitor.FileMonitor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FileMonitor fileMonitor = new FileMonitor();
		fileMonitor.start();
		
//		MoveFileKeeper moveFileKeeper = new MoveFileKeeper();
//		String path = CollectConfigure.getInstance().getProperty("collect.monitorPath");
//		System.out.println(path);
//		File file = new File(path);
//		
//		int cnt = 0;
//		for (File f : file.listFiles()) {
//			boolean checkModifyDate = moveFileKeeper.checkModifyDate(f);
//			if (checkModifyDate) {
//				cnt++;
//				System.out.println(file.getAbsolutePath());
//			}
//		}
//		System.out.println("total:" + cnt);
	}
}
