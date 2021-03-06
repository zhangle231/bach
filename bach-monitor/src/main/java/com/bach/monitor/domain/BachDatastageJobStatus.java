package com.bach.monitor.domain;

import java.util.Date;

public class BachDatastageJobStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.job_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String jobName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.if_online
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String ifOnline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.start_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.end_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.elapsed_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Integer elapsedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.job_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String jobStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.update_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.avg_elapsed_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Integer avgElapsedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.parent_job_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String parentJobName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.seq_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String seqName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.seq_category
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String seqCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.seq_update_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Date seqUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.remark
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_datastage_job_status.reg_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Date regTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.job_name
     *
     * @return the value of bach_datastage_job_status.job_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.job_name
     *
     * @param jobName the value for bach_datastage_job_status.job_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.if_online
     *
     * @return the value of bach_datastage_job_status.if_online
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getIfOnline() {
        return ifOnline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.if_online
     *
     * @param ifOnline the value for bach_datastage_job_status.if_online
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setIfOnline(String ifOnline) {
        this.ifOnline = ifOnline == null ? null : ifOnline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.start_time
     *
     * @return the value of bach_datastage_job_status.start_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.start_time
     *
     * @param startTime the value for bach_datastage_job_status.start_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.end_time
     *
     * @return the value of bach_datastage_job_status.end_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.end_time
     *
     * @param endTime the value for bach_datastage_job_status.end_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.elapsed_time
     *
     * @return the value of bach_datastage_job_status.elapsed_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Integer getElapsedTime() {
        return elapsedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.elapsed_time
     *
     * @param elapsedTime the value for bach_datastage_job_status.elapsed_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.job_status
     *
     * @return the value of bach_datastage_job_status.job_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.job_status
     *
     * @param jobStatus the value for bach_datastage_job_status.job_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.update_time
     *
     * @return the value of bach_datastage_job_status.update_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.update_time
     *
     * @param updateTime the value for bach_datastage_job_status.update_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.avg_elapsed_time
     *
     * @return the value of bach_datastage_job_status.avg_elapsed_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Integer getAvgElapsedTime() {
        return avgElapsedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.avg_elapsed_time
     *
     * @param avgElapsedTime the value for bach_datastage_job_status.avg_elapsed_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setAvgElapsedTime(Integer avgElapsedTime) {
        this.avgElapsedTime = avgElapsedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.parent_job_name
     *
     * @return the value of bach_datastage_job_status.parent_job_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getParentJobName() {
        return parentJobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.parent_job_name
     *
     * @param parentJobName the value for bach_datastage_job_status.parent_job_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setParentJobName(String parentJobName) {
        this.parentJobName = parentJobName == null ? null : parentJobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.seq_name
     *
     * @return the value of bach_datastage_job_status.seq_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getSeqName() {
        return seqName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.seq_name
     *
     * @param seqName the value for bach_datastage_job_status.seq_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.seq_category
     *
     * @return the value of bach_datastage_job_status.seq_category
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getSeqCategory() {
        return seqCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.seq_category
     *
     * @param seqCategory the value for bach_datastage_job_status.seq_category
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setSeqCategory(String seqCategory) {
        this.seqCategory = seqCategory == null ? null : seqCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.seq_update_time
     *
     * @return the value of bach_datastage_job_status.seq_update_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Date getSeqUpdateTime() {
        return seqUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.seq_update_time
     *
     * @param seqUpdateTime the value for bach_datastage_job_status.seq_update_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setSeqUpdateTime(Date seqUpdateTime) {
        this.seqUpdateTime = seqUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.remark
     *
     * @return the value of bach_datastage_job_status.remark
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.remark
     *
     * @param remark the value for bach_datastage_job_status.remark
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_datastage_job_status.reg_time
     *
     * @return the value of bach_datastage_job_status.reg_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_datastage_job_status.reg_time
     *
     * @param regTime the value for bach_datastage_job_status.reg_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}