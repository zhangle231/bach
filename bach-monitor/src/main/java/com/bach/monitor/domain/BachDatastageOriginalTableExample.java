package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.List;

public class BachDatastageOriginalTableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachDatastageOriginalTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
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
     * This method corresponds to the database table bach_datastage_original_table
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
     * This method corresponds to the database table bach_datastage_original_table
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_original_table
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
     * This class corresponds to the database table bach_datastage_original_table
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

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrIsNull() {
            addCriterion("tns_connect_str is null");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrIsNotNull() {
            addCriterion("tns_connect_str is not null");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrEqualTo(String value) {
            addCriterion("tns_connect_str =", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrNotEqualTo(String value) {
            addCriterion("tns_connect_str <>", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrGreaterThan(String value) {
            addCriterion("tns_connect_str >", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrGreaterThanOrEqualTo(String value) {
            addCriterion("tns_connect_str >=", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrLessThan(String value) {
            addCriterion("tns_connect_str <", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrLessThanOrEqualTo(String value) {
            addCriterion("tns_connect_str <=", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrLike(String value) {
            addCriterion("tns_connect_str like", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrNotLike(String value) {
            addCriterion("tns_connect_str not like", value, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrIn(List<String> values) {
            addCriterion("tns_connect_str in", values, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrNotIn(List<String> values) {
            addCriterion("tns_connect_str not in", values, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrBetween(String value1, String value2) {
            addCriterion("tns_connect_str between", value1, value2, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsConnectStrNotBetween(String value1, String value2) {
            addCriterion("tns_connect_str not between", value1, value2, "tnsConnectStr");
            return (Criteria) this;
        }

        public Criteria andTnsIp1IsNull() {
            addCriterion("tns_ip1 is null");
            return (Criteria) this;
        }

        public Criteria andTnsIp1IsNotNull() {
            addCriterion("tns_ip1 is not null");
            return (Criteria) this;
        }

        public Criteria andTnsIp1EqualTo(String value) {
            addCriterion("tns_ip1 =", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1NotEqualTo(String value) {
            addCriterion("tns_ip1 <>", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1GreaterThan(String value) {
            addCriterion("tns_ip1 >", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1GreaterThanOrEqualTo(String value) {
            addCriterion("tns_ip1 >=", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1LessThan(String value) {
            addCriterion("tns_ip1 <", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1LessThanOrEqualTo(String value) {
            addCriterion("tns_ip1 <=", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1Like(String value) {
            addCriterion("tns_ip1 like", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1NotLike(String value) {
            addCriterion("tns_ip1 not like", value, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1In(List<String> values) {
            addCriterion("tns_ip1 in", values, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1NotIn(List<String> values) {
            addCriterion("tns_ip1 not in", values, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1Between(String value1, String value2) {
            addCriterion("tns_ip1 between", value1, value2, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsIp1NotBetween(String value1, String value2) {
            addCriterion("tns_ip1 not between", value1, value2, "tnsIp1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1IsNull() {
            addCriterion("tns_port1 is null");
            return (Criteria) this;
        }

        public Criteria andTnsPort1IsNotNull() {
            addCriterion("tns_port1 is not null");
            return (Criteria) this;
        }

        public Criteria andTnsPort1EqualTo(String value) {
            addCriterion("tns_port1 =", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1NotEqualTo(String value) {
            addCriterion("tns_port1 <>", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1GreaterThan(String value) {
            addCriterion("tns_port1 >", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1GreaterThanOrEqualTo(String value) {
            addCriterion("tns_port1 >=", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1LessThan(String value) {
            addCriterion("tns_port1 <", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1LessThanOrEqualTo(String value) {
            addCriterion("tns_port1 <=", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1Like(String value) {
            addCriterion("tns_port1 like", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1NotLike(String value) {
            addCriterion("tns_port1 not like", value, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1In(List<String> values) {
            addCriterion("tns_port1 in", values, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1NotIn(List<String> values) {
            addCriterion("tns_port1 not in", values, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1Between(String value1, String value2) {
            addCriterion("tns_port1 between", value1, value2, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsPort1NotBetween(String value1, String value2) {
            addCriterion("tns_port1 not between", value1, value2, "tnsPort1");
            return (Criteria) this;
        }

        public Criteria andTnsIp2IsNull() {
            addCriterion("tns_ip2 is null");
            return (Criteria) this;
        }

        public Criteria andTnsIp2IsNotNull() {
            addCriterion("tns_ip2 is not null");
            return (Criteria) this;
        }

        public Criteria andTnsIp2EqualTo(String value) {
            addCriterion("tns_ip2 =", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2NotEqualTo(String value) {
            addCriterion("tns_ip2 <>", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2GreaterThan(String value) {
            addCriterion("tns_ip2 >", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2GreaterThanOrEqualTo(String value) {
            addCriterion("tns_ip2 >=", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2LessThan(String value) {
            addCriterion("tns_ip2 <", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2LessThanOrEqualTo(String value) {
            addCriterion("tns_ip2 <=", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2Like(String value) {
            addCriterion("tns_ip2 like", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2NotLike(String value) {
            addCriterion("tns_ip2 not like", value, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2In(List<String> values) {
            addCriterion("tns_ip2 in", values, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2NotIn(List<String> values) {
            addCriterion("tns_ip2 not in", values, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2Between(String value1, String value2) {
            addCriterion("tns_ip2 between", value1, value2, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsIp2NotBetween(String value1, String value2) {
            addCriterion("tns_ip2 not between", value1, value2, "tnsIp2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2IsNull() {
            addCriterion("tns_port2 is null");
            return (Criteria) this;
        }

        public Criteria andTnsPort2IsNotNull() {
            addCriterion("tns_port2 is not null");
            return (Criteria) this;
        }

        public Criteria andTnsPort2EqualTo(String value) {
            addCriterion("tns_port2 =", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2NotEqualTo(String value) {
            addCriterion("tns_port2 <>", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2GreaterThan(String value) {
            addCriterion("tns_port2 >", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2GreaterThanOrEqualTo(String value) {
            addCriterion("tns_port2 >=", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2LessThan(String value) {
            addCriterion("tns_port2 <", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2LessThanOrEqualTo(String value) {
            addCriterion("tns_port2 <=", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2Like(String value) {
            addCriterion("tns_port2 like", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2NotLike(String value) {
            addCriterion("tns_port2 not like", value, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2In(List<String> values) {
            addCriterion("tns_port2 in", values, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2NotIn(List<String> values) {
            addCriterion("tns_port2 not in", values, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2Between(String value1, String value2) {
            addCriterion("tns_port2 between", value1, value2, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsPort2NotBetween(String value1, String value2) {
            addCriterion("tns_port2 not between", value1, value2, "tnsPort2");
            return (Criteria) this;
        }

        public Criteria andTnsLocationIsNull() {
            addCriterion("tns_location is null");
            return (Criteria) this;
        }

        public Criteria andTnsLocationIsNotNull() {
            addCriterion("tns_location is not null");
            return (Criteria) this;
        }

        public Criteria andTnsLocationEqualTo(String value) {
            addCriterion("tns_location =", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationNotEqualTo(String value) {
            addCriterion("tns_location <>", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationGreaterThan(String value) {
            addCriterion("tns_location >", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("tns_location >=", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationLessThan(String value) {
            addCriterion("tns_location <", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationLessThanOrEqualTo(String value) {
            addCriterion("tns_location <=", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationLike(String value) {
            addCriterion("tns_location like", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationNotLike(String value) {
            addCriterion("tns_location not like", value, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationIn(List<String> values) {
            addCriterion("tns_location in", values, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationNotIn(List<String> values) {
            addCriterion("tns_location not in", values, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationBetween(String value1, String value2) {
            addCriterion("tns_location between", value1, value2, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andTnsLocationNotBetween(String value1, String value2) {
            addCriterion("tns_location not between", value1, value2, "tnsLocation");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_datastage_original_table
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
     * This class corresponds to the database table bach_datastage_original_table
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