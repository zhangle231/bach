package org.bach.collect.web;

import java.util.ArrayList;
import java.util.List;

import org.bach.collect.web.handler.CollectApiService;
import org.bach.common.web.jetty.JettyServer;
import org.eclipse.jetty.servlet.ServletHandler;

public class CollectWebServer extends JettyServer {

	public CollectWebServer(int port, String resourceBase, List<String> welcomFiles) {
		super(port, resourceBase, welcomFiles);
	}

	public static void main(String[] args) {
		List<String> welcomFiles = new ArrayList<>();
		welcomFiles.add("index.html");
		CollectWebServer server = new CollectWebServer(9001, "webapp", welcomFiles);
		
		ServletHandler handler = server.getServletHandler();
		handler.addServletWithMapping(CollectApiService.class, "/api/collect-api");
		
		server.start();
	}
}
