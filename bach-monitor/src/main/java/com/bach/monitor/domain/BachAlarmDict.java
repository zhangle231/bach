package com.bach.monitor.domain;

public class BachAlarmDict {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_alarm_dict.COM_TYPE
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String comType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_alarm_dict.COM_CODE
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String comCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_alarm_dict.COM_CODE_DESC
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String comCodeDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_alarm_dict.COM_TYPE
     *
     * @return the value of bach_alarm_dict.COM_TYPE
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getComType() {
        return comType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_alarm_dict.COM_TYPE
     *
     * @param comType the value for bach_alarm_dict.COM_TYPE
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setComType(String comType) {
        this.comType = comType == null ? null : comType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_alarm_dict.COM_CODE
     *
     * @return the value of bach_alarm_dict.COM_CODE
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getComCode() {
        return comCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_alarm_dict.COM_CODE
     *
     * @param comCode the value for bach_alarm_dict.COM_CODE
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setComCode(String comCode) {
        this.comCode = comCode == null ? null : comCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_alarm_dict.COM_CODE_DESC
     *
     * @return the value of bach_alarm_dict.COM_CODE_DESC
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getComCodeDesc() {
        return comCodeDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_alarm_dict.COM_CODE_DESC
     *
     * @param comCodeDesc the value for bach_alarm_dict.COM_CODE_DESC
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setComCodeDesc(String comCodeDesc) {
        this.comCodeDesc = comCodeDesc == null ? null : comCodeDesc.trim();
    }
}