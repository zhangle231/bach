package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BachAlarmStatusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachAlarmStatusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
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
     * This method corresponds to the database table bach_alarm_status
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
     * This method corresponds to the database table bach_alarm_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_alarm_status
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
     * This class corresponds to the database table bach_alarm_status
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

        public Criteria andMonitorStatusIsNull() {
            addCriterion("monitor_status is null");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIsNotNull() {
            addCriterion("monitor_status is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusEqualTo(Boolean value) {
            addCriterion("monitor_status =", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotEqualTo(Boolean value) {
            addCriterion("monitor_status <>", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusGreaterThan(Boolean value) {
            addCriterion("monitor_status >", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("monitor_status >=", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusLessThan(Boolean value) {
            addCriterion("monitor_status <", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("monitor_status <=", value, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusIn(List<Boolean> values) {
            addCriterion("monitor_status in", values, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotIn(List<Boolean> values) {
            addCriterion("monitor_status not in", values, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("monitor_status between", value1, value2, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andMonitorStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("monitor_status not between", value1, value2, "monitorStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeIsNull() {
            addCriterion("last_monitortime is null");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeIsNotNull() {
            addCriterion("last_monitortime is not null");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeEqualTo(Date value) {
            addCriterion("last_monitortime =", value, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeNotEqualTo(Date value) {
            addCriterion("last_monitortime <>", value, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeGreaterThan(Date value) {
            addCriterion("last_monitortime >", value, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_monitortime >=", value, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeLessThan(Date value) {
            addCriterion("last_monitortime <", value, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeLessThanOrEqualTo(Date value) {
            addCriterion("last_monitortime <=", value, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeIn(List<Date> values) {
            addCriterion("last_monitortime in", values, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeNotIn(List<Date> values) {
            addCriterion("last_monitortime not in", values, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeBetween(Date value1, Date value2) {
            addCriterion("last_monitortime between", value1, value2, "lastMonitortime");
            return (Criteria) this;
        }

        public Criteria andLastMonitortimeNotBetween(Date value1, Date value2) {
            addCriterion("last_monitortime not between", value1, value2, "lastMonitortime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_alarm_status
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
     * This class corresponds to the database table bach_alarm_status
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