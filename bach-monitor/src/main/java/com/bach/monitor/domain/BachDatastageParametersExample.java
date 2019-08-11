package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.List;

public class BachDatastageParametersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachDatastageParametersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
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
     * This method corresponds to the database table bach_datastage_parameters
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
     * This method corresponds to the database table bach_datastage_parameters
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_parameters
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
     * This class corresponds to the database table bach_datastage_parameters
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

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(String value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(String value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(String value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(String value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLike(String value) {
            addCriterion("modified_time like", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotLike(String value) {
            addCriterion("modified_time not like", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<String> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<String> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(String value1, String value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPromptIsNull() {
            addCriterion("prompt is null");
            return (Criteria) this;
        }

        public Criteria andPromptIsNotNull() {
            addCriterion("prompt is not null");
            return (Criteria) this;
        }

        public Criteria andPromptEqualTo(String value) {
            addCriterion("prompt =", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptNotEqualTo(String value) {
            addCriterion("prompt <>", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptGreaterThan(String value) {
            addCriterion("prompt >", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptGreaterThanOrEqualTo(String value) {
            addCriterion("prompt >=", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptLessThan(String value) {
            addCriterion("prompt <", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptLessThanOrEqualTo(String value) {
            addCriterion("prompt <=", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptLike(String value) {
            addCriterion("prompt like", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptNotLike(String value) {
            addCriterion("prompt not like", value, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptIn(List<String> values) {
            addCriterion("prompt in", values, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptNotIn(List<String> values) {
            addCriterion("prompt not in", values, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptBetween(String value1, String value2) {
            addCriterion("prompt between", value1, value2, "prompt");
            return (Criteria) this;
        }

        public Criteria andPromptNotBetween(String value1, String value2) {
            addCriterion("prompt not between", value1, value2, "prompt");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNull() {
            addCriterion("param_type is null");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNotNull() {
            addCriterion("param_type is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypeEqualTo(String value) {
            addCriterion("param_type =", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotEqualTo(String value) {
            addCriterion("param_type <>", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThan(String value) {
            addCriterion("param_type >", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("param_type >=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThan(String value) {
            addCriterion("param_type <", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThanOrEqualTo(String value) {
            addCriterion("param_type <=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLike(String value) {
            addCriterion("param_type like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotLike(String value) {
            addCriterion("param_type not like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeIn(List<String> values) {
            addCriterion("param_type in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotIn(List<String> values) {
            addCriterion("param_type not in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeBetween(String value1, String value2) {
            addCriterion("param_type between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotBetween(String value1, String value2) {
            addCriterion("param_type not between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamLengthIsNull() {
            addCriterion("param_length is null");
            return (Criteria) this;
        }

        public Criteria andParamLengthIsNotNull() {
            addCriterion("param_length is not null");
            return (Criteria) this;
        }

        public Criteria andParamLengthEqualTo(String value) {
            addCriterion("param_length =", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthNotEqualTo(String value) {
            addCriterion("param_length <>", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthGreaterThan(String value) {
            addCriterion("param_length >", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthGreaterThanOrEqualTo(String value) {
            addCriterion("param_length >=", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthLessThan(String value) {
            addCriterion("param_length <", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthLessThanOrEqualTo(String value) {
            addCriterion("param_length <=", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthLike(String value) {
            addCriterion("param_length like", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthNotLike(String value) {
            addCriterion("param_length not like", value, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthIn(List<String> values) {
            addCriterion("param_length in", values, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthNotIn(List<String> values) {
            addCriterion("param_length not in", values, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthBetween(String value1, String value2) {
            addCriterion("param_length between", value1, value2, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamLengthNotBetween(String value1, String value2) {
            addCriterion("param_length not between", value1, value2, "paramLength");
            return (Criteria) this;
        }

        public Criteria andParamScaleIsNull() {
            addCriterion("param_scale is null");
            return (Criteria) this;
        }

        public Criteria andParamScaleIsNotNull() {
            addCriterion("param_scale is not null");
            return (Criteria) this;
        }

        public Criteria andParamScaleEqualTo(String value) {
            addCriterion("param_scale =", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleNotEqualTo(String value) {
            addCriterion("param_scale <>", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleGreaterThan(String value) {
            addCriterion("param_scale >", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleGreaterThanOrEqualTo(String value) {
            addCriterion("param_scale >=", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleLessThan(String value) {
            addCriterion("param_scale <", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleLessThanOrEqualTo(String value) {
            addCriterion("param_scale <=", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleLike(String value) {
            addCriterion("param_scale like", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleNotLike(String value) {
            addCriterion("param_scale not like", value, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleIn(List<String> values) {
            addCriterion("param_scale in", values, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleNotIn(List<String> values) {
            addCriterion("param_scale not in", values, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleBetween(String value1, String value2) {
            addCriterion("param_scale between", value1, value2, "paramScale");
            return (Criteria) this;
        }

        public Criteria andParamScaleNotBetween(String value1, String value2) {
            addCriterion("param_scale not between", value1, value2, "paramScale");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bach_datastage_parameters
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
     * This class corresponds to the database table bach_datastage_parameters
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