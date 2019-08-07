package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.List;

public class BachDatastageParamServerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachDatastageParamServerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
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
     * This method corresponds to the database table bach_datastage_param_server
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
     * This method corresponds to the database table bach_datastage_param_server
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_param_server
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
     * This class corresponds to the database table bach_datastage_param_server
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

        public Criteria andLinkTypeIsNull() {
            addCriterion("link_type is null");
            return (Criteria) this;
        }

        public Criteria andLinkTypeIsNotNull() {
            addCriterion("link_type is not null");
            return (Criteria) this;
        }

        public Criteria andLinkTypeEqualTo(String value) {
            addCriterion("link_type =", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotEqualTo(String value) {
            addCriterion("link_type <>", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeGreaterThan(String value) {
            addCriterion("link_type >", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("link_type >=", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeLessThan(String value) {
            addCriterion("link_type <", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeLessThanOrEqualTo(String value) {
            addCriterion("link_type <=", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeLike(String value) {
            addCriterion("link_type like", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotLike(String value) {
            addCriterion("link_type not like", value, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeIn(List<String> values) {
            addCriterion("link_type in", values, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotIn(List<String> values) {
            addCriterion("link_type not in", values, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeBetween(String value1, String value2) {
            addCriterion("link_type between", value1, value2, "linkType");
            return (Criteria) this;
        }

        public Criteria andLinkTypeNotBetween(String value1, String value2) {
            addCriterion("link_type not between", value1, value2, "linkType");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andProp1IsNull() {
            addCriterion("prop1 is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion("prop1 is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(String value) {
            addCriterion("prop1 =", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(String value) {
            addCriterion("prop1 <>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(String value) {
            addCriterion("prop1 >", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(String value) {
            addCriterion("prop1 >=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(String value) {
            addCriterion("prop1 <", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(String value) {
            addCriterion("prop1 <=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(String value) {
            addCriterion("prop1 like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(String value) {
            addCriterion("prop1 not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<String> values) {
            addCriterion("prop1 in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<String> values) {
            addCriterion("prop1 not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(String value1, String value2) {
            addCriterion("prop1 between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(String value1, String value2) {
            addCriterion("prop1 not between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1IsNull() {
            addCriterion("address_ip1 is null");
            return (Criteria) this;
        }

        public Criteria andAddressIp1IsNotNull() {
            addCriterion("address_ip1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIp1EqualTo(String value) {
            addCriterion("address_ip1 =", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1NotEqualTo(String value) {
            addCriterion("address_ip1 <>", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1GreaterThan(String value) {
            addCriterion("address_ip1 >", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1GreaterThanOrEqualTo(String value) {
            addCriterion("address_ip1 >=", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1LessThan(String value) {
            addCriterion("address_ip1 <", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1LessThanOrEqualTo(String value) {
            addCriterion("address_ip1 <=", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1Like(String value) {
            addCriterion("address_ip1 like", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1NotLike(String value) {
            addCriterion("address_ip1 not like", value, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1In(List<String> values) {
            addCriterion("address_ip1 in", values, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1NotIn(List<String> values) {
            addCriterion("address_ip1 not in", values, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1Between(String value1, String value2) {
            addCriterion("address_ip1 between", value1, value2, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressIp1NotBetween(String value1, String value2) {
            addCriterion("address_ip1 not between", value1, value2, "addressIp1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1IsNull() {
            addCriterion("address_port1 is null");
            return (Criteria) this;
        }

        public Criteria andAddressPort1IsNotNull() {
            addCriterion("address_port1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPort1EqualTo(String value) {
            addCriterion("address_port1 =", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1NotEqualTo(String value) {
            addCriterion("address_port1 <>", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1GreaterThan(String value) {
            addCriterion("address_port1 >", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1GreaterThanOrEqualTo(String value) {
            addCriterion("address_port1 >=", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1LessThan(String value) {
            addCriterion("address_port1 <", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1LessThanOrEqualTo(String value) {
            addCriterion("address_port1 <=", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1Like(String value) {
            addCriterion("address_port1 like", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1NotLike(String value) {
            addCriterion("address_port1 not like", value, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1In(List<String> values) {
            addCriterion("address_port1 in", values, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1NotIn(List<String> values) {
            addCriterion("address_port1 not in", values, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1Between(String value1, String value2) {
            addCriterion("address_port1 between", value1, value2, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressPort1NotBetween(String value1, String value2) {
            addCriterion("address_port1 not between", value1, value2, "addressPort1");
            return (Criteria) this;
        }

        public Criteria andAddressIp2IsNull() {
            addCriterion("address_ip2 is null");
            return (Criteria) this;
        }

        public Criteria andAddressIp2IsNotNull() {
            addCriterion("address_ip2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIp2EqualTo(String value) {
            addCriterion("address_ip2 =", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2NotEqualTo(String value) {
            addCriterion("address_ip2 <>", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2GreaterThan(String value) {
            addCriterion("address_ip2 >", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2GreaterThanOrEqualTo(String value) {
            addCriterion("address_ip2 >=", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2LessThan(String value) {
            addCriterion("address_ip2 <", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2LessThanOrEqualTo(String value) {
            addCriterion("address_ip2 <=", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2Like(String value) {
            addCriterion("address_ip2 like", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2NotLike(String value) {
            addCriterion("address_ip2 not like", value, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2In(List<String> values) {
            addCriterion("address_ip2 in", values, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2NotIn(List<String> values) {
            addCriterion("address_ip2 not in", values, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2Between(String value1, String value2) {
            addCriterion("address_ip2 between", value1, value2, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressIp2NotBetween(String value1, String value2) {
            addCriterion("address_ip2 not between", value1, value2, "addressIp2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2IsNull() {
            addCriterion("address_port2 is null");
            return (Criteria) this;
        }

        public Criteria andAddressPort2IsNotNull() {
            addCriterion("address_port2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPort2EqualTo(String value) {
            addCriterion("address_port2 =", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2NotEqualTo(String value) {
            addCriterion("address_port2 <>", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2GreaterThan(String value) {
            addCriterion("address_port2 >", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2GreaterThanOrEqualTo(String value) {
            addCriterion("address_port2 >=", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2LessThan(String value) {
            addCriterion("address_port2 <", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2LessThanOrEqualTo(String value) {
            addCriterion("address_port2 <=", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2Like(String value) {
            addCriterion("address_port2 like", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2NotLike(String value) {
            addCriterion("address_port2 not like", value, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2In(List<String> values) {
            addCriterion("address_port2 in", values, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2NotIn(List<String> values) {
            addCriterion("address_port2 not in", values, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2Between(String value1, String value2) {
            addCriterion("address_port2 between", value1, value2, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andAddressPort2NotBetween(String value1, String value2) {
            addCriterion("address_port2 not between", value1, value2, "addressPort2");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeIsNull() {
            addCriterion("connect_data_type is null");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeIsNotNull() {
            addCriterion("connect_data_type is not null");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeEqualTo(String value) {
            addCriterion("connect_data_type =", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeNotEqualTo(String value) {
            addCriterion("connect_data_type <>", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeGreaterThan(String value) {
            addCriterion("connect_data_type >", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("connect_data_type >=", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeLessThan(String value) {
            addCriterion("connect_data_type <", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeLessThanOrEqualTo(String value) {
            addCriterion("connect_data_type <=", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeLike(String value) {
            addCriterion("connect_data_type like", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeNotLike(String value) {
            addCriterion("connect_data_type not like", value, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeIn(List<String> values) {
            addCriterion("connect_data_type in", values, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeNotIn(List<String> values) {
            addCriterion("connect_data_type not in", values, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeBetween(String value1, String value2) {
            addCriterion("connect_data_type between", value1, value2, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataTypeNotBetween(String value1, String value2) {
            addCriterion("connect_data_type not between", value1, value2, "connectDataType");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueIsNull() {
            addCriterion("connect_data_value is null");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueIsNotNull() {
            addCriterion("connect_data_value is not null");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueEqualTo(String value) {
            addCriterion("connect_data_value =", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueNotEqualTo(String value) {
            addCriterion("connect_data_value <>", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueGreaterThan(String value) {
            addCriterion("connect_data_value >", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueGreaterThanOrEqualTo(String value) {
            addCriterion("connect_data_value >=", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueLessThan(String value) {
            addCriterion("connect_data_value <", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueLessThanOrEqualTo(String value) {
            addCriterion("connect_data_value <=", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueLike(String value) {
            addCriterion("connect_data_value like", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueNotLike(String value) {
            addCriterion("connect_data_value not like", value, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueIn(List<String> values) {
            addCriterion("connect_data_value in", values, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueNotIn(List<String> values) {
            addCriterion("connect_data_value not in", values, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueBetween(String value1, String value2) {
            addCriterion("connect_data_value between", value1, value2, "connectDataValue");
            return (Criteria) this;
        }

        public Criteria andConnectDataValueNotBetween(String value1, String value2) {
            addCriterion("connect_data_value not between", value1, value2, "connectDataValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_datastage_param_server
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
     * This class corresponds to the database table bach_datastage_param_server
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