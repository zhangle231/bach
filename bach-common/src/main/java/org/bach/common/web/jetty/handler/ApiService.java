package org.bach.common.web.jetty.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.Logger;
import org.bach.common.log.BachLogger;

public class ApiService extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = BachLogger.getLogger(ApiService.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOG.debug("call api service.");
		resp.setContentType("text/json");
		resp.setStatus(HttpServletResponse.SC_OK);
		resp.getWriter().println("{\"name\": \"cxh\"}");
	}

}
