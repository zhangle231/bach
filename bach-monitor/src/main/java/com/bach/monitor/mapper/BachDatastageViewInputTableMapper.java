package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachDatastageViewInputTable;
import com.bach.monitor.domain.BachDatastageViewInputTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachDatastageViewInputTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachDatastageViewInputTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachDatastageViewInputTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachDatastageViewInputTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachDatastageViewInputTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachDatastageViewInputTable> selectByExample(BachDatastageViewInputTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachDatastageViewInputTable record, @Param("example") BachDatastageViewInputTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_view_input_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachDatastageViewInputTable record, @Param("example") BachDatastageViewInputTableExample example);
}