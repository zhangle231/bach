package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachDatastageSeqList;
import com.bach.monitor.domain.BachDatastageSeqListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachDatastageSeqListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachDatastageSeqListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachDatastageSeqListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachDatastageSeqList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachDatastageSeqList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachDatastageSeqList> selectByExample(BachDatastageSeqListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachDatastageSeqList record, @Param("example") BachDatastageSeqListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_seq_list
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachDatastageSeqList record, @Param("example") BachDatastageSeqListExample example);
}