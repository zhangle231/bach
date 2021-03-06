package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BachOldAlarmNotificationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachOldAlarmNotificationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAlarmNumIsNull() {
            addCriterion("alarm_num is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNumIsNotNull() {
            addCriterion("alarm_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNumEqualTo(Integer value) {
            addCriterion("alarm_num =", value, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumNotEqualTo(Integer value) {
            addCriterion("alarm_num <>", value, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumGreaterThan(Integer value) {
            addCriterion("alarm_num >", value, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_num >=", value, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumLessThan(Integer value) {
            addCriterion("alarm_num <", value, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_num <=", value, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumIn(List<Integer> values) {
            addCriterion("alarm_num in", values, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumNotIn(List<Integer> values) {
            addCriterion("alarm_num not in", values, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumBetween(Integer value1, Integer value2) {
            addCriterion("alarm_num between", value1, value2, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andAlarmNumNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_num not between", value1, value2, "alarmNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumIsNull() {
            addCriterion("monitor_num is null");
            return (Criteria) this;
        }

        public Criteria andMonitorNumIsNotNull() {
            addCriterion("monitor_num is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorNumEqualTo(Integer value) {
            addCriterion("monitor_num =", value, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumNotEqualTo(Integer value) {
            addCriterion("monitor_num <>", value, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumGreaterThan(Integer value) {
            addCriterion("monitor_num >", value, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_num >=", value, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumLessThan(Integer value) {
            addCriterion("monitor_num <", value, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_num <=", value, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumIn(List<Integer> values) {
            addCriterion("monitor_num in", values, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumNotIn(List<Integer> values) {
            addCriterion("monitor_num not in", values, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumBetween(Integer value1, Integer value2) {
            addCriterion("monitor_num between", value1, value2, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andMonitorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_num not between", value1, value2, "monitorNum");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(String value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(String value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(String value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(String value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(String value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLike(String value) {
            addCriterion("alarm_type like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotLike(String value) {
            addCriterion("alarm_type not like", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<String> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<String> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(String value1, String value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(String value1, String value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("server_ip is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("server_ip is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("server_ip =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("server_ip <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("server_ip >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("server_ip >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("server_ip <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("server_ip <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("server_ip like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("server_ip not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("server_ip in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("server_ip not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("server_ip between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("server_ip not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNull() {
            addCriterion("alarm_name is null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIsNotNull() {
            addCriterion("alarm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmNameEqualTo(String value) {
            addCriterion("alarm_name =", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotEqualTo(String value) {
            addCriterion("alarm_name <>", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThan(String value) {
            addCriterion("alarm_name >", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_name >=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThan(String value) {
            addCriterion("alarm_name <", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLessThanOrEqualTo(String value) {
            addCriterion("alarm_name <=", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameLike(String value) {
            addCriterion("alarm_name like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotLike(String value) {
            addCriterion("alarm_name not like", value, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameIn(List<String> values) {
            addCriterion("alarm_name in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotIn(List<String> values) {
            addCriterion("alarm_name not in", values, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameBetween(String value1, String value2) {
            addCriterion("alarm_name between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmNameNotBetween(String value1, String value2) {
            addCriterion("alarm_name not between", value1, value2, "alarmName");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNull() {
            addCriterion("alarm_level is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNotNull() {
            addCriterion("alarm_level is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelEqualTo(String value) {
            addCriterion("alarm_level =", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotEqualTo(String value) {
            addCriterion("alarm_level <>", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThan(String value) {
            addCriterion("alarm_level >", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_level >=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThan(String value) {
            addCriterion("alarm_level <", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThanOrEqualTo(String value) {
            addCriterion("alarm_level <=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLike(String value) {
            addCriterion("alarm_level like", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotLike(String value) {
            addCriterion("alarm_level not like", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIn(List<String> values) {
            addCriterion("alarm_level in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotIn(List<String> values) {
            addCriterion("alarm_level not in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelBetween(String value1, String value2) {
            addCriterion("alarm_level between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotBetween(String value1, String value2) {
            addCriterion("alarm_level not between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNull() {
            addCriterion("alarm_status is null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNotNull() {
            addCriterion("alarm_status is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusEqualTo(String value) {
            addCriterion("alarm_status =", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotEqualTo(String value) {
            addCriterion("alarm_status <>", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThan(String value) {
            addCriterion("alarm_status >", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_status >=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThan(String value) {
            addCriterion("alarm_status <", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThanOrEqualTo(String value) {
            addCriterion("alarm_status <=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLike(String value) {
            addCriterion("alarm_status like", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotLike(String value) {
            addCriterion("alarm_status not like", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIn(List<String> values) {
            addCriterion("alarm_status in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotIn(List<String> values) {
            addCriterion("alarm_status not in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusBetween(String value1, String value2) {
            addCriterion("alarm_status between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotBetween(String value1, String value2) {
            addCriterion("alarm_status not between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmContentIsNull() {
            addCriterion("alarm_content is null");
            return (Criteria) this;
        }

        public Criteria andAlarmContentIsNotNull() {
            addCriterion("alarm_content is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmContentEqualTo(String value) {
            addCriterion("alarm_content =", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentNotEqualTo(String value) {
            addCriterion("alarm_content <>", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentGreaterThan(String value) {
            addCriterion("alarm_content >", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_content >=", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentLessThan(String value) {
            addCriterion("alarm_content <", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentLessThanOrEqualTo(String value) {
            addCriterion("alarm_content <=", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentLike(String value) {
            addCriterion("alarm_content like", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentNotLike(String value) {
            addCriterion("alarm_content not like", value, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentIn(List<String> values) {
            addCriterion("alarm_content in", values, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentNotIn(List<String> values) {
            addCriterion("alarm_content not in", values, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentBetween(String value1, String value2) {
            addCriterion("alarm_content between", value1, value2, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmContentNotBetween(String value1, String value2) {
            addCriterion("alarm_content not between", value1, value2, "alarmContent");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeIsNull() {
            addCriterion("alarm_protime is null");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeIsNotNull() {
            addCriterion("alarm_protime is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeEqualTo(Date value) {
            addCriterion("alarm_protime =", value, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeNotEqualTo(Date value) {
            addCriterion("alarm_protime <>", value, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeGreaterThan(Date value) {
            addCriterion("alarm_protime >", value, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarm_protime >=", value, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeLessThan(Date value) {
            addCriterion("alarm_protime <", value, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeLessThanOrEqualTo(Date value) {
            addCriterion("alarm_protime <=", value, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeIn(List<Date> values) {
            addCriterion("alarm_protime in", values, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeNotIn(List<Date> values) {
            addCriterion("alarm_protime not in", values, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeBetween(Date value1, Date value2) {
            addCriterion("alarm_protime between", value1, value2, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andAlarmProtimeNotBetween(Date value1, Date value2) {
            addCriterion("alarm_protime not between", value1, value2, "alarmProtime");
            return (Criteria) this;
        }

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("system like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("system not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("system not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Boolean value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Boolean value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Boolean value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Boolean value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Boolean value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Boolean> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Boolean> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Boolean value1, Boolean value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("send_status like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("send_status not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 01 12:36:06 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_old_alarm_notification
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}