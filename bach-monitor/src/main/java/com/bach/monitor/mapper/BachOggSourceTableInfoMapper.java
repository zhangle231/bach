package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggSourceTableInfo;
import com.bach.monitor.domain.BachOggSourceTableInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggSourceTableInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggSourceTableInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggSourceTableInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggSourceTableInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggSourceTableInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggSourceTableInfo> selectByExample(BachOggSourceTableInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggSourceTableInfo record, @Param("example") BachOggSourceTableInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_source_table_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggSourceTableInfo record, @Param("example") BachOggSourceTableInfoExample example);
}