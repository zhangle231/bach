package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachDatastageJobStatusHis;
import com.bach.monitor.domain.BachDatastageJobStatusHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachDatastageJobStatusHisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachDatastageJobStatusHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachDatastageJobStatusHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachDatastageJobStatusHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachDatastageJobStatusHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachDatastageJobStatusHis> selectByExample(BachDatastageJobStatusHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachDatastageJobStatusHis record, @Param("example") BachDatastageJobStatusHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_job_status_his
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachDatastageJobStatusHis record, @Param("example") BachDatastageJobStatusHisExample example);
}