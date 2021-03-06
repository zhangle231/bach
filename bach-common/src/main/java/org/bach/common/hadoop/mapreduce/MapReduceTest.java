package org.bach.common.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.MRJobConfig;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.LazyOutputFormat;
import org.bach.common.hadoop.mapreduce.FileClean.FileInfo;

public class MapReduceTest extends Mapper<NullWritable, BytesWritable, Text, Text> {

	@Override
	protected void map(NullWritable key, BytesWritable value, Context context)
			throws IOException, InterruptedException {
		String line = new String(value.getBytes(), 0, value.getLength(), "GBK");

		FileClean fc = new FileClean();
		FileInfo fi = fc.parseFile(line);

		context.write(new Text(fi.getFileName()), new Text(fi.getContent()));
	}

	public static void main(String[] args) {
		try {
			System.setProperty("HADOOP_HOME", "D:\\bin2\\hadoop-2.6.0");
			System.setProperty("hadoop.home.dir", "D:\\bin2\\hadoop-2.6.0");
			System.setProperty("HADOOP_USER_NAME", "hdfs");

			Configuration conf = new Configuration();
			// 设置MapReduce的输出的分隔符为逗号
			conf.set("mapred.textoutputformat.ignoreseparator", "true");
//			char sep = 0x1b;
//			conf.set("mapred.textoutputformat.separator", String.valueOf(sep));
//			conf.set("mapred.textoutputformat.separator", ";");
			
//			conf.set("mapred.min.split.size", "1024000000");
			
			conf.set(MRJobConfig.NUM_MAPS, "10");

			Job job = new Job(conf);
			job.setJarByClass(MapReduceTest.class);
			job.setJobName("test");

			job.setInputFormatClass(WholeFileInputFormat.class);

//			FileInputFormat.addInputPath(job, new Path("/test/tmp/"));
//			FileInputFormat.addInputPath(job, new Path("/test/2019-05-04/"));
			FileInputFormat.addInputPath(job, new Path("har:///archive/2019-05-04/2019-05-04.har"));
			FileOutputFormat.setOutputPath(job, new Path("/out"));

			LazyOutputFormat.setOutputFormatClass(job, MyTextOutputFormat.class);

			job.setMapperClass(MapReduceTest.class);
			job.setReducerClass(FileCleanReduce.class);

			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(Text.class);
			
			job.setNumReduceTasks(3);

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
