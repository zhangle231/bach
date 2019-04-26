package org.bach.collect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CollectConfigure {
	
	private static CollectConfigure instance;
	
	public static CollectConfigure getInstance() {
		if (instance == null) {
			instance = new CollectConfigure();
			instance.init();
		}
		return instance;
	}
	
	Properties properties = new Properties();
	
	public void init() {
		InputStream inputStream = ClassLoader.getSystemResourceAsStream("collect.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public static void main(String[] args) {
		CollectConfigure collectConfigure = CollectConfigure.getInstance();
		String monitorPath = collectConfigure.getProperty("collect.monitorPath");
		System.out.println(monitorPath);
	}


}
