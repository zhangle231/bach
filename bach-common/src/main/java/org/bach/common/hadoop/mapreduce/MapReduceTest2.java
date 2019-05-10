package org.bach.common.hadoop.mapreduce;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

public class MapReduceTest2 extends Mapper<NullWritable, BytesWritable, Text, Text> {

	private static final Log LOG = LogFactory.getLog(MapReduceTest2.class);

//	@Override
//	protected void setup(Mapper<LongWritable, BytesWritable, Text, BytesWritable>.Context context)
//			throws IOException, InterruptedException {
////		FileSplit split = (FileSplit)context.getInputSplit();
////		Path path = split.getPath();
////		fileNameKey = new Text(path.toString());
//
//		CombineFileSplit split = (CombineFileSplit) context.getInputSplit();
//		
//		System.out.println(split.getLengths());
//		
//		for (int i = 0; i < split.getNumPaths(); i++) {
//			Path path = split.getPath(i);
//			fileNameKey = new Text(path.toString());
//		}
//	}
	@Override
	protected void map(NullWritable key, BytesWritable value, Context context)
			throws IOException, InterruptedException {
		Configuration configuration = context.getConfiguration();
		Text filenameKey = new Text(configuration.get(MRJobConfig.MAP_INPUT_FILE));
		LOG.info(filenameKey.toString());
		String line = new String(value.getBytes(), 0, value.getLength(), "GBK");

		FileClean fc = new FileClean();
		FileInfo fi = fc.parseFile2(line);

		String tmp = filenameKey.toString();
		String newKey;
		Pattern pattern = Pattern.compile("ogg_PGI_([^_]*)_");
		Matcher matcher = pattern.matcher(tmp);
		if (matcher.find()) {
			newKey = matcher.group(1);
		} else {
			newKey = "error";
		}

		context.write(new Text(newKey), new Text(filenameKey + String.valueOf((char) 0x1b) + fi.getContent()));
	}

	public static void main(String[] args) {

		String date[] = { "2019-05-01", "2019-05-03", "2019-05-04", "2019-05-05", "2019-05-06", "2019-05-07",
				"2019-05-08" };
		for (int i = 0; i < date.length; i++) {
			try {
				System.setProperty("HADOOP_HOME", "D:\\bin2\\hadoop-2.6.0");
				System.setProperty("hadoop.home.dir", "D:\\bin2\\hadoop-2.6.0");
				System.setProperty("HADOOP_USER_NAME", "hdfs");

				Configuration conf = new Configuration();

				conf.set(MRJobConfig.NUM_MAPS, "2");

				Job job = new Job(conf);
				job.setJarByClass(MapReduceTest2.class);
				job.setJobName("SmallFilesToSequenceFileConverter");

//			job.setInputFormatClass(WholeFileInputFormat.class);
				job.setInputFormatClass(MyCombineFileInputFormat.class);
//			job.setOutputFormatClass(SequenceFileOutputFormat.class);
				job.setOutputFormatClass(MyTextOutputFormat.class);

				FileInputFormat.addInputPath(job, new Path("/test/" + date[i]));
				FileOutputFormat.setOutputPath(job, new Path("/out/" + date[i]));

//			FileInputFormat.addInputPath(job, new Path("/test/tmp"));
//			FileOutputFormat.setOutputPath(job, new Path("/out/tmp/"));
//			FileInputFormat.addInputPath(job, new Path("har:///archive/2019-05-04/2019-05-04.har"));

				job.setMapperClass(MapReduceTest2.class);
				job.setReducerClass(FileCleanReduce2.class);

				LazyOutputFormat.setOutputFormatClass(job, MyTextOutputFormat.class);

				job.setOutputKeyClass(Text.class);
				job.setOutputValueClass(Text.class);

				job.setNumReduceTasks(2);

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
}
