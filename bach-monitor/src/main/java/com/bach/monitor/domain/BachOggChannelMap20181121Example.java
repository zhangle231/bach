package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.List;

public class BachOggChannelMap20181121Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachOggChannelMap20181121Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
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
     * This method corresponds to the database table bach_ogg_channel_map_20181121
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
     * This method corresponds to the database table bach_ogg_channel_map_20181121
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_20181121
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
     * This class corresponds to the database table bach_ogg_channel_map_20181121
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

        public Criteria andSrcIpIsNull() {
            addCriterion("src_ip is null");
            return (Criteria) this;
        }

        public Criteria andSrcIpIsNotNull() {
            addCriterion("src_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSrcIpEqualTo(String value) {
            addCriterion("src_ip =", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotEqualTo(String value) {
            addCriterion("src_ip <>", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpGreaterThan(String value) {
            addCriterion("src_ip >", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpGreaterThanOrEqualTo(String value) {
            addCriterion("src_ip >=", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpLessThan(String value) {
            addCriterion("src_ip <", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpLessThanOrEqualTo(String value) {
            addCriterion("src_ip <=", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpLike(String value) {
            addCriterion("src_ip like", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotLike(String value) {
            addCriterion("src_ip not like", value, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpIn(List<String> values) {
            addCriterion("src_ip in", values, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotIn(List<String> values) {
            addCriterion("src_ip not in", values, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpBetween(String value1, String value2) {
            addCriterion("src_ip between", value1, value2, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcIpNotBetween(String value1, String value2) {
            addCriterion("src_ip not between", value1, value2, "srcIp");
            return (Criteria) this;
        }

        public Criteria andSrcChannelIsNull() {
            addCriterion("src_channel is null");
            return (Criteria) this;
        }

        public Criteria andSrcChannelIsNotNull() {
            addCriterion("src_channel is not null");
            return (Criteria) this;
        }

        public Criteria andSrcChannelEqualTo(String value) {
            addCriterion("src_channel =", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelNotEqualTo(String value) {
            addCriterion("src_channel <>", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelGreaterThan(String value) {
            addCriterion("src_channel >", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelGreaterThanOrEqualTo(String value) {
            addCriterion("src_channel >=", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelLessThan(String value) {
            addCriterion("src_channel <", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelLessThanOrEqualTo(String value) {
            addCriterion("src_channel <=", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelLike(String value) {
            addCriterion("src_channel like", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelNotLike(String value) {
            addCriterion("src_channel not like", value, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelIn(List<String> values) {
            addCriterion("src_channel in", values, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelNotIn(List<String> values) {
            addCriterion("src_channel not in", values, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelBetween(String value1, String value2) {
            addCriterion("src_channel between", value1, value2, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andSrcChannelNotBetween(String value1, String value2) {
            addCriterion("src_channel not between", value1, value2, "srcChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelIsNull() {
            addCriterion("pmp_channel is null");
            return (Criteria) this;
        }

        public Criteria andPmpChannelIsNotNull() {
            addCriterion("pmp_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPmpChannelEqualTo(String value) {
            addCriterion("pmp_channel =", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelNotEqualTo(String value) {
            addCriterion("pmp_channel <>", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelGreaterThan(String value) {
            addCriterion("pmp_channel >", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pmp_channel >=", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelLessThan(String value) {
            addCriterion("pmp_channel <", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelLessThanOrEqualTo(String value) {
            addCriterion("pmp_channel <=", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelLike(String value) {
            addCriterion("pmp_channel like", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelNotLike(String value) {
            addCriterion("pmp_channel not like", value, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelIn(List<String> values) {
            addCriterion("pmp_channel in", values, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelNotIn(List<String> values) {
            addCriterion("pmp_channel not in", values, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelBetween(String value1, String value2) {
            addCriterion("pmp_channel between", value1, value2, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andPmpChannelNotBetween(String value1, String value2) {
            addCriterion("pmp_channel not between", value1, value2, "pmpChannel");
            return (Criteria) this;
        }

        public Criteria andDstIpIsNull() {
            addCriterion("dst_ip is null");
            return (Criteria) this;
        }

        public Criteria andDstIpIsNotNull() {
            addCriterion("dst_ip is not null");
            return (Criteria) this;
        }

        public Criteria andDstIpEqualTo(String value) {
            addCriterion("dst_ip =", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotEqualTo(String value) {
            addCriterion("dst_ip <>", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpGreaterThan(String value) {
            addCriterion("dst_ip >", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpGreaterThanOrEqualTo(String value) {
            addCriterion("dst_ip >=", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpLessThan(String value) {
            addCriterion("dst_ip <", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpLessThanOrEqualTo(String value) {
            addCriterion("dst_ip <=", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpLike(String value) {
            addCriterion("dst_ip like", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotLike(String value) {
            addCriterion("dst_ip not like", value, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpIn(List<String> values) {
            addCriterion("dst_ip in", values, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotIn(List<String> values) {
            addCriterion("dst_ip not in", values, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpBetween(String value1, String value2) {
            addCriterion("dst_ip between", value1, value2, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstIpNotBetween(String value1, String value2) {
            addCriterion("dst_ip not between", value1, value2, "dstIp");
            return (Criteria) this;
        }

        public Criteria andDstChannelIsNull() {
            addCriterion("dst_channel is null");
            return (Criteria) this;
        }

        public Criteria andDstChannelIsNotNull() {
            addCriterion("dst_channel is not null");
            return (Criteria) this;
        }

        public Criteria andDstChannelEqualTo(String value) {
            addCriterion("dst_channel =", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelNotEqualTo(String value) {
            addCriterion("dst_channel <>", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelGreaterThan(String value) {
            addCriterion("dst_channel >", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelGreaterThanOrEqualTo(String value) {
            addCriterion("dst_channel >=", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelLessThan(String value) {
            addCriterion("dst_channel <", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelLessThanOrEqualTo(String value) {
            addCriterion("dst_channel <=", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelLike(String value) {
            addCriterion("dst_channel like", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelNotLike(String value) {
            addCriterion("dst_channel not like", value, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelIn(List<String> values) {
            addCriterion("dst_channel in", values, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelNotIn(List<String> values) {
            addCriterion("dst_channel not in", values, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelBetween(String value1, String value2) {
            addCriterion("dst_channel between", value1, value2, "dstChannel");
            return (Criteria) this;
        }

        public Criteria andDstChannelNotBetween(String value1, String value2) {
            addCriterion("dst_channel not between", value1, value2, "dstChannel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_ogg_channel_map_20181121
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
     * This class corresponds to the database table bach_ogg_channel_map_20181121
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