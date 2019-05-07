package org.bach.common.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class MyTextOutputFormat extends TextOutputFormat {

	@Override
	public RecordWriter getRecordWriter(TaskAttemptContext job) throws IOException, InterruptedException {
	    Configuration conf = job.getConfiguration();
		char c = 0x1b;
		String tmp = String.valueOf(c);
	    conf.set(SEPERATOR, tmp);
		return super.getRecordWriter(job);
	}
}
