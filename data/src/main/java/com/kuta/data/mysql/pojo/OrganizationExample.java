/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    /**
     * @date 2021-07-15 12:55:28
     */
    protected String orderByClause;

    /**
     * @date 2021-07-15 12:55:28
     */
    protected boolean distinct;

    /**
     * @date 2021-07-15 12:55:28
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public OrganizationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
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
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * Organization
     * BS_Organization
     * @date 2021-07-15 12:55:28
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

        public Criteria andOidIsNull() {
            addCriterion("`oid` is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("`oid` is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("`oid` =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("`oid` <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("`oid` >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`oid` >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("`oid` <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("`oid` <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("`oid` in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("`oid` not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("`oid` between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("`oid` not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParentOidIsNull() {
            addCriterion("`parent_oid` is null");
            return (Criteria) this;
        }

        public Criteria andParentOidIsNotNull() {
            addCriterion("`parent_oid` is not null");
            return (Criteria) this;
        }

        public Criteria andParentOidEqualTo(Integer value) {
            addCriterion("`parent_oid` =", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidNotEqualTo(Integer value) {
            addCriterion("`parent_oid` <>", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidGreaterThan(Integer value) {
            addCriterion("`parent_oid` >", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`parent_oid` >=", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidLessThan(Integer value) {
            addCriterion("`parent_oid` <", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidLessThanOrEqualTo(Integer value) {
            addCriterion("`parent_oid` <=", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidIn(List<Integer> values) {
            addCriterion("`parent_oid` in", values, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidNotIn(List<Integer> values) {
            addCriterion("`parent_oid` not in", values, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidBetween(Integer value1, Integer value2) {
            addCriterion("`parent_oid` between", value1, value2, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidNotBetween(Integer value1, Integer value2) {
            addCriterion("`parent_oid` not between", value1, value2, "parentOid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("`created` is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("`created` is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("`created` =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("`created` <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("`created` >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("`created` >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("`created` <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("`created` <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("`created` in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("`created` not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("`created` between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("`created` not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`oid` =", value, "oid");
            }
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`oid` >=", value, "oid");
            }
            return (Criteria) this;
        }

        public Criteria andOidIn(boolean condition, List<Integer> value) {
            if (condition) {
                addCriterion("`oid` in", value, "oid");
            }
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`name` =", value, "name");
            }
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`name` >=", value, "name");
            }
            return (Criteria) this;
        }

        public Criteria andNameIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`name` in", value, "name");
            }
            return (Criteria) this;
        }

        public Criteria andParentOidEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`parent_oid` =", value, "parentOid");
            }
            return (Criteria) this;
        }

        public Criteria andParentOidGreaterThanOrEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`parent_oid` >=", value, "parentOid");
            }
            return (Criteria) this;
        }

        public Criteria andParentOidIn(boolean condition, List<Integer> value) {
            if (condition) {
                addCriterion("`parent_oid` in", value, "parentOid");
            }
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`status` =", value, "status");
            }
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`status` >=", value, "status");
            }
            return (Criteria) this;
        }

        public Criteria andStatusIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`status` in", value, "status");
            }
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(boolean condition, Date value) {
            if (condition) {
                addCriterion("`created` =", value, "created");
            }
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(boolean condition, Date value) {
            if (condition) {
                addCriterion("`created` >=", value, "created");
            }
            return (Criteria) this;
        }

        public Criteria andCreatedIn(boolean condition, List<Date> value) {
            if (condition) {
                addCriterion("`created` in", value, "created");
            }
            return (Criteria) this;
        }
    }

    /**
     * null<p/>
     * BS_Organization
     * @date 2021-07-15 12:55:28
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * Organization
     * BS_Organization
     * @date 2021-07-15 12:55:28
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