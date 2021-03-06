package com.bach.monitor.domain;

import java.util.ArrayList;
import java.util.List;

public class BachDatastageTableDefinitionsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public BachDatastageTableDefinitionsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
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
     * This method corresponds to the database table bach_datastage_table_definitions
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
     * This method corresponds to the database table bach_datastage_table_definitions
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_datastage_table_definitions
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
     * This class corresponds to the database table bach_datastage_table_definitions
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

        public Criteria andDataStoreIsNull() {
            addCriterion("data_store is null");
            return (Criteria) this;
        }

        public Criteria andDataStoreIsNotNull() {
            addCriterion("data_store is not null");
            return (Criteria) this;
        }

        public Criteria andDataStoreEqualTo(String value) {
            addCriterion("data_store =", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreNotEqualTo(String value) {
            addCriterion("data_store <>", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreGreaterThan(String value) {
            addCriterion("data_store >", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreGreaterThanOrEqualTo(String value) {
            addCriterion("data_store >=", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreLessThan(String value) {
            addCriterion("data_store <", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreLessThanOrEqualTo(String value) {
            addCriterion("data_store <=", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreLike(String value) {
            addCriterion("data_store like", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreNotLike(String value) {
            addCriterion("data_store not like", value, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreIn(List<String> values) {
            addCriterion("data_store in", values, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreNotIn(List<String> values) {
            addCriterion("data_store not in", values, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreBetween(String value1, String value2) {
            addCriterion("data_store between", value1, value2, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataStoreNotBetween(String value1, String value2) {
            addCriterion("data_store not between", value1, value2, "dataStore");
            return (Criteria) this;
        }

        public Criteria andDataSchemaIsNull() {
            addCriterion("data_schema is null");
            return (Criteria) this;
        }

        public Criteria andDataSchemaIsNotNull() {
            addCriterion("data_schema is not null");
            return (Criteria) this;
        }

        public Criteria andDataSchemaEqualTo(String value) {
            addCriterion("data_schema =", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaNotEqualTo(String value) {
            addCriterion("data_schema <>", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaGreaterThan(String value) {
            addCriterion("data_schema >", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("data_schema >=", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaLessThan(String value) {
            addCriterion("data_schema <", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaLessThanOrEqualTo(String value) {
            addCriterion("data_schema <=", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaLike(String value) {
            addCriterion("data_schema like", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaNotLike(String value) {
            addCriterion("data_schema not like", value, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaIn(List<String> values) {
            addCriterion("data_schema in", values, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaNotIn(List<String> values) {
            addCriterion("data_schema not in", values, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaBetween(String value1, String value2) {
            addCriterion("data_schema between", value1, value2, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataSchemaNotBetween(String value1, String value2) {
            addCriterion("data_schema not between", value1, value2, "dataSchema");
            return (Criteria) this;
        }

        public Criteria andDataCollectionIsNull() {
            addCriterion("data_collection is null");
            return (Criteria) this;
        }

        public Criteria andDataCollectionIsNotNull() {
            addCriterion("data_collection is not null");
            return (Criteria) this;
        }

        public Criteria andDataCollectionEqualTo(String value) {
            addCriterion("data_collection =", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionNotEqualTo(String value) {
            addCriterion("data_collection <>", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionGreaterThan(String value) {
            addCriterion("data_collection >", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("data_collection >=", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionLessThan(String value) {
            addCriterion("data_collection <", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionLessThanOrEqualTo(String value) {
            addCriterion("data_collection <=", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionLike(String value) {
            addCriterion("data_collection like", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionNotLike(String value) {
            addCriterion("data_collection not like", value, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionIn(List<String> values) {
            addCriterion("data_collection in", values, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionNotIn(List<String> values) {
            addCriterion("data_collection not in", values, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionBetween(String value1, String value2) {
            addCriterion("data_collection between", value1, value2, "dataCollection");
            return (Criteria) this;
        }

        public Criteria andDataCollectionNotBetween(String value1, String value2) {
            addCriterion("data_collection not between", value1, value2, "dataCollection");
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
     * This class corresponds to the database table bach_datastage_table_definitions
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
     * This class corresponds to the database table bach_datastage_table_definitions
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