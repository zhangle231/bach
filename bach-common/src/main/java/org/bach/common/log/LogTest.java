package org.bach.common.log;

import org.apache.logging.log4j.Logger;

public class LogTest {

	static final Logger logger = BachLogger.getLogger(LogTest.class);

	public static void main(String[] args) {
		logger.debug("Entering application.");
	}

}
