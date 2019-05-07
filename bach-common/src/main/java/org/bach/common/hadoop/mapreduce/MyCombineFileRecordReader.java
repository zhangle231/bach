package org.bach.common.hadoop.mapreduce;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.CombineFileSplit;

public class MyCombineFileRecordReader extends RecordReader<NullWritable, BytesWritable> {

	private CombineFileSplit fileSplit;
	private Configuration conf;
	private BytesWritable value = new BytesWritable();
	private boolean processed = false;

	@Override
	public void initialize(InputSplit split, TaskAttemptContext context) throws IOException, InterruptedException {
		this.fileSplit = (CombineFileSplit) split;
		this.conf = context.getConfiguration();
	}

	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		if (!processed) {
			long fLength = fileSplit.getNumPaths();

			int fileNamesLength = 0;
			for (int i = 0; i < fLength; i++) {
				Path file = fileSplit.getPath(i);
				String fileName = file.getName();
				fileNamesLength += fileName.getBytes().length + 1;
				System.out.println();
			}

			byte[] contents = new byte[(int) fileSplit.getLength() + fileNamesLength];

			int pos = 0;
			for (int j = 0; j < fLength; j++) {

				Path file = fileSplit.getPath(j);
				String fileName = file.getName();

				FileSystem fs = file.getFileSystem(conf);
				FSDataInputStream in = null;
				try {
					for (int i = 0; i < fileName.getBytes().length; i++) {
						contents[pos++] = fileName.getBytes()[i];
					}
					contents[pos++] = '|';
					in = fs.open(file);
					IOUtils.readFully(in, contents, pos++, (int) fileSplit.getLength(j));
					pos += fileSplit.getLength(j);
				} finally {
					IOUtils.closeStream(in);
				}
			}
			value.set(contents, 0, contents.length);

			processed = true;
			return true;
		}
		return false;
	}

	@Override
	public NullWritable getCurrentKey() throws IOException, InterruptedException {
		return NullWritable.get();
	}

	@Override
	public BytesWritable getCurrentValue() throws IOException, InterruptedException {
		return value;
	}

	@Override
	public float getProgress() throws IOException, InterruptedException {
		return processed ? 1.0f : 0.0f;
	}

	@Override
	public void close() throws IOException {
	}

}
