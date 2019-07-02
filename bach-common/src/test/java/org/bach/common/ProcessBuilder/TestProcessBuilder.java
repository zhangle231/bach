package org.bach.common.ProcessBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import junit.framework.TestCase;

public class TestProcessBuilder extends TestCase {

	public void testProcessBuilder() {
		ProcessBuilder processBuilder = new ProcessBuilder("calc", "aaa123");
		Process process;
		try {
			process = processBuilder.start();
			InputStream inputStream = process.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
