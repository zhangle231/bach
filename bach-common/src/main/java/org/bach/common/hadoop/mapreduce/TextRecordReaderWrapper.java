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
import org.apache.hadoop.mapreduce.lib.input.CombineFileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReaderWrapper;
import org.apache.hadoop.mapreduce.lib.input.CombineFileSplit;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class TextRecordReaderWrapper extends CombineFileRecordReaderWrapper<NullWritable, BytesWritable> {

	public TextRecordReaderWrapper(CombineFileSplit split, TaskAttemptContext context, Integer idx)
			throws IOException, InterruptedException {
		super(new CombineFileInputFormat<NullWritable, BytesWritable>() {

			@Override
			public RecordReader<NullWritable, BytesWritable> createRecordReader(InputSplit split,
					TaskAttemptContext context) throws IOException {

				RecordReader<NullWritable, BytesWritable> reader = new RecordReader<NullWritable, BytesWritable>() {

					private BytesWritable value = new BytesWritable();
					private boolean processed = false;
					private FileSplit fileSplit;
					private Configuration conf;

					@Override
					public void initialize(InputSplit split, TaskAttemptContext context)
							throws IOException, InterruptedException {
						this.fileSplit = (FileSplit) split;
						this.conf = context.getConfiguration();
					}

					@Override
					public boolean nextKeyValue() throws IOException, InterruptedException {

						if (!processed) {

							byte[] content = new byte[(int) fileSplit.getLength()];

							int pos = 0;

							Path path = fileSplit.getPath();
							FileSystem fs = path.getFileSystem(conf);
							FSDataInputStream in = fs.open(path);

							try {
								IOUtils.readFully(in, content, pos, (int) fileSplit.getLength());
							} finally {
								in.close();
							}
							value.set(content, 0, content.length);
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

				};

				try {
					reader.initialize(split, context);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				return reader;
			}
		}, split, context, idx);
	}
}