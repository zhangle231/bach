package org.bach.common.yarn;

import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.yarn.api.ApplicationConstants;
import org.apache.hadoop.yarn.api.ApplicationConstants.Environment;
import org.apache.hadoop.yarn.api.protocolrecords.GetNewApplicationResponse;
import org.apache.hadoop.yarn.api.records.ApplicationId;
import org.apache.hadoop.yarn.api.records.ApplicationSubmissionContext;
import org.apache.hadoop.yarn.api.records.ContainerLaunchContext;
import org.apache.hadoop.yarn.api.records.LocalResource;
import org.apache.hadoop.yarn.api.records.Resource;
import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.hadoop.yarn.client.api.YarnClientApplication;
import org.apache.hadoop.yarn.conf.YarnConfiguration;

public class YarnTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("HADOOP_HOME", "D:\\bin2\\hadoop-2.6.0");
		System.setProperty("hadoop.home.dir", "D:\\bin2\\hadoop-2.6.0");
		System.setProperty("HADOOP_USER_NAME", "hdfs");

		YarnClient yarnClient = YarnClient.createYarnClient();
		Configuration conf = new Configuration();
		yarnClient.init(conf);
		yarnClient.start();

		YarnClientApplication app = yarnClient.createApplication();
		GetNewApplicationResponse appResponse = app.getNewApplicationResponse();

		// set the application submission context
		ApplicationSubmissionContext appContext = app.getApplicationSubmissionContext();
		ApplicationId appId = appContext.getApplicationId();

		appContext.setKeepContainersAcrossApplicationAttempts(true);
		appContext.setApplicationName("Yarn Test");

		// set local resources for the application master
		// local files or archives as needed
		// In this scenario, the jar file for the application master is part of the
		// local resources
		Map<String, LocalResource> localResources = new HashMap<String, LocalResource>();

		FileSystem fs = FileSystem.get(conf);
//		addToLocalResources(fs, appMasterJar, appMasterJarPath, appId.toString(),
//		    localResources, null);

		String hdfsShellScriptLocation = "";
		long hdfsShellScriptLen = 0;
		long hdfsShellScriptTimestamp = 0;
//		if (!shellScriptPath.isEmpty()) {
//			Path shellSrc = new Path(shellScriptPath);
//			String shellPathSuffix = appName + "/" + appId.toString() + "/" + SCRIPT_PATH;
//			Path shellDst = new Path(fs.getHomeDirectory(), shellPathSuffix);
//			fs.copyFromLocalFile(false, true, shellSrc, shellDst);
//			hdfsShellScriptLocation = shellDst.toUri().toString();
//			FileStatus shellFileStatus = fs.getFileStatus(shellDst);
//			hdfsShellScriptLen = shellFileStatus.getLen();
//			hdfsShellScriptTimestamp = shellFileStatus.getModificationTime();
//		}

		StringBuilder classPathEnv = new StringBuilder(Environment.CLASSPATH.$$())
				.append(ApplicationConstants.CLASS_PATH_SEPARATOR).append("./*");
		for (String c : conf.getStrings(YarnConfiguration.YARN_APPLICATION_CLASSPATH,
				YarnConfiguration.DEFAULT_YARN_CROSS_PLATFORM_APPLICATION_CLASSPATH)) {
			classPathEnv.append(ApplicationConstants.CLASS_PATH_SEPARATOR);
			classPathEnv.append(c.trim());
		}
		
		// Set up the container launch context for the application master
		ContainerLaunchContext amContainer = ContainerLaunchContext.newInstance(
		  localResources, null, null, null, null, null);
		
		Resource capability = Resource.newInstance(1024, 1);
		appContext.setResource(capability);
		
		appContext.setAMContainerSpec(amContainer);

		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
