package com.bach.monitor.domain;

public class BachAlarmSubtypeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_alarm_subtype.alarm_subtype
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String alarmSubtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_alarm_subtype.alarm_type
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String alarmType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_alarm_subtype.alarm_subtype
     *
     * @return the value of bach_alarm_subtype.alarm_subtype
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getAlarmSubtype() {
        return alarmSubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_alarm_subtype.alarm_subtype
     *
     * @param alarmSubtype the value for bach_alarm_subtype.alarm_subtype
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setAlarmSubtype(String alarmSubtype) {
        this.alarmSubtype = alarmSubtype == null ? null : alarmSubtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_alarm_subtype.alarm_type
     *
     * @return the value of bach_alarm_subtype.alarm_type
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_alarm_subtype.alarm_type
     *
     * @param alarmType the value for bach_alarm_subtype.alarm_type
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType == null ? null : alarmType.trim();
    }
}