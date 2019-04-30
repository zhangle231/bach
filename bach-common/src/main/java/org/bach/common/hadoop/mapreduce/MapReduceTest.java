package org.bach.common.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MapReduceTest extends Mapper<NullWritable, BytesWritable, Text, IntWritable> {

	@Override
	protected void map(NullWritable key, BytesWritable value, Context context)
			throws IOException, InterruptedException {
		String line = new String(value.getBytes(), 0, value.getLength(), "GBK");

		context.write(new Text(line), new IntWritable(1));
	}

	public static void main(String[] args) {
//		try {
//			String ch = "对";
//			byte[] bytes = ch.getBytes("GBK");
//			String ch1 = new String(bytes, "GBK");
//			System.out.println("123");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}

		try {
			System.setProperty("HADOOP_HOME", "D:\\bin2\\hadoop-2.6.0");
			System.setProperty("hadoop.home.dir", "D:\\bin2\\hadoop-2.6.0");
			System.setProperty("HADOOP_USER_NAME", "hdfs");
			Job job = new Job();
			job.setJarByClass(MapReduceTest.class);
			job.setJobName("test");

			job.setInputFormatClass(WholeFileInputFormat.class);

			FileInputFormat.addInputPath(job, new Path("/test/tmp/"));
//			FileInputFormat.addInputPath(job, new Path("/test/2019-04-28/"));
			FileOutputFormat.setOutputPath(job, new Path("/out"));
			job.setMapperClass(MapReduceTest.class);

			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(IntWritable.class);

//			System.exit(job.waitForCompletion(true) ? 0 : 1);
			job.waitForCompletion(true);

			System.out.println("job url:" + job.getHistoryUrl());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
