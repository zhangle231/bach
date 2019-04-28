package org.bach.collect.monitor.upload;

import java.util.Date;

public class UploadFileInfo {
	
	private String fileName;
	
	private Date uploadTime;
	
	private Date modifyTime;
	
	private long size;
		
	private boolean isArchived;
	
	private Date ArchivedTime;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public boolean isArchived() {
		return isArchived;
	}

	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}

	public Date getArchivedTime() {
		return ArchivedTime;
	}

	public void setArchivedTime(Date archivedTime) {
		ArchivedTime = archivedTime;
	}
	
}
