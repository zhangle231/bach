package org.bach.common.zookeeper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooKeeper.States;
import org.apache.zookeeper.data.Stat;

import junit.framework.TestCase;

public class TestZookeeper extends TestCase {

	public void testConn() {
		Watcher watch = new Watcher() {
			@Override
			public void process(WatchedEvent event) {
			}
		};
		while (true) {
			try {
				ZooKeeper zooKeeper = new ZooKeeper("10.7.91.104:2181,10.7.91.104:2182,10.7.91.104:2183", 3000, watch);
				Stat stat = new Stat();
				while (true) {
					States state = zooKeeper.getState();
					if (States.CONNECTED == state) {
						System.out.println(state);
						break;
					}
					System.out.println(state);
					TimeUnit.SECONDS.sleep(1);
				}
				
				CreateMode createMode = CreateMode.EPHEMERAL;
				zooKeeper.create("/zk_test1", "my_data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, createMode);
				
				byte[] data = zooKeeper.getData("/zk_test1", true, stat);
				System.out.println(new String(data));
				zooKeeper.close();
				TimeUnit.SECONDS.sleep(1);
			} catch (IOException | KeeperException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
