package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachAlarmConfiguration;
import com.bach.monitor.domain.BachAlarmConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachAlarmConfigurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachAlarmConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachAlarmConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByPrimaryKey(Integer monitorNum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachAlarmConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachAlarmConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachAlarmConfiguration> selectByExample(BachAlarmConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    BachAlarmConfiguration selectByPrimaryKey(Integer monitorNum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachAlarmConfiguration record, @Param("example") BachAlarmConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachAlarmConfiguration record, @Param("example") BachAlarmConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKeySelective(BachAlarmConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_configuration
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKey(BachAlarmConfiguration record);
}