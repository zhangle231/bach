package org.bach.common.web.jetty;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class JettyServer {

	private int port;

	private String resourceBase;

	private List<String> welcomFiles;

	private Server server;

	public JettyServer(int port, String resourceBase, List<String> welcomFiles) {
		super();
		this.port = port;
		this.resourceBase = resourceBase;
		this.welcomFiles = welcomFiles;
	}

	public void start() {
		server = new Server(port);
		// SelectChannelConnector connector = new SelectChannelConnector();
		// connector.setPort(8080);
		// server.addConnector(connector);
		ResourceHandler handler = new ResourceHandler(); // 静态资源处理的handler
		handler.setDirectoriesListed(true); // 会显示一个列表
		handler.setWelcomeFiles(welcomFiles.toArray(new String[0]));
		File f = new File("");
		System.out.println(f.getAbsolutePath());
		handler.setResourceBase(resourceBase);
		server.setHandler(handler);
		try {
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		List<String> welcomFiles = new ArrayList<>();
		welcomFiles.add("index.html");
		JettyServer jettyServer = new JettyServer(8080, "webapp", welcomFiles);
		jettyServer.start();
	}
}
