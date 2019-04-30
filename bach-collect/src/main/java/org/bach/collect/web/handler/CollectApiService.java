package org.bach.collect.web.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;
import org.bach.common.web.jetty.handler.ApiService;

public class CollectApiService extends ApiService {

	private static final Logger LOG = BachLogger.getLogger(CollectApiService.class);

	public ServletRequestHandler getProcess(String name) {
		if ("UploadFileInfo".equals(name)) {
			return new UploadFileInfoHandler();
		}
		return null;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOG.debug("call collect api service.");
		String name = req.getParameter("name");
		LOG.debug("name:{}", name);
		ServletRequestHandler process = getProcess(name);
		String result = process.execute();
		resp.setContentType("text/json");
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().println(result);
//		resp.getWriter().println("{\"name\": \"cxh\"}");
	}

}
