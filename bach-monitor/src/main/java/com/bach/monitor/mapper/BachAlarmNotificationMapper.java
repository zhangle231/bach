package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachAlarmNotification;
import com.bach.monitor.domain.BachAlarmNotificationExample;
import com.bach.monitor.domain.BachAlarmNotificationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachAlarmNotificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByPrimaryKey(BachAlarmNotificationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachAlarmNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachAlarmNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachAlarmNotification> selectByExampleWithBLOBs(BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachAlarmNotification> selectByExample(BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    BachAlarmNotification selectByPrimaryKey(BachAlarmNotificationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachAlarmNotification record, @Param("example") BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") BachAlarmNotification record, @Param("example") BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachAlarmNotification record, @Param("example") BachAlarmNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKeySelective(BachAlarmNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(BachAlarmNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKey(BachAlarmNotification record);
}