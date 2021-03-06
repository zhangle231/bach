package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachDatastageRowsLog;
import com.bach.monitor.domain.BachDatastageRowsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachDatastageRowsLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachDatastageRowsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachDatastageRowsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachDatastageRowsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachDatastageRowsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachDatastageRowsLog> selectByExample(BachDatastageRowsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachDatastageRowsLog record, @Param("example") BachDatastageRowsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_rows_log
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachDatastageRowsLog record, @Param("example") BachDatastageRowsLogExample example);
}