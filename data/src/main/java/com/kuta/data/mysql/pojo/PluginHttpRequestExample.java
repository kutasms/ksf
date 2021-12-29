/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import java.util.ArrayList;
import java.util.List;

public class PluginHttpRequestExample {
    /**
     * @date 2021-12-28 00:51:29
     */
    protected String orderByClause;

    /**
     * @date 2021-12-28 00:51:29
     */
    protected boolean distinct;

    /**
     * @date 2021-12-28 00:51:29
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public PluginHttpRequestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
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
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * PluginHttpRequest
     * BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
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

        public Criteria andPhridIsNull() {
            addCriterion("`phrid` is null");
            return (Criteria) this;
        }

        public Criteria andPhridIsNotNull() {
            addCriterion("`phrid` is not null");
            return (Criteria) this;
        }

        public Criteria andPhridEqualTo(Long value) {
            addCriterion("`phrid` =", value, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridNotEqualTo(Long value) {
            addCriterion("`phrid` <>", value, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridGreaterThan(Long value) {
            addCriterion("`phrid` >", value, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridGreaterThanOrEqualTo(Long value) {
            addCriterion("`phrid` >=", value, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridLessThan(Long value) {
            addCriterion("`phrid` <", value, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridLessThanOrEqualTo(Long value) {
            addCriterion("`phrid` <=", value, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridIn(List<Long> values) {
            addCriterion("`phrid` in", values, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridNotIn(List<Long> values) {
            addCriterion("`phrid` not in", values, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridBetween(Long value1, Long value2) {
            addCriterion("`phrid` between", value1, value2, "phrid");
            return (Criteria) this;
        }

        public Criteria andPhridNotBetween(Long value1, Long value2) {
            addCriterion("`phrid` not between", value1, value2, "phrid");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("`key` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`key` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("`key` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("`key` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("`key` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`key` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("`key` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("`key` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("`key` like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("`key` not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("`key` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("`key` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("`key` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("`key` not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andPoidIsNull() {
            addCriterion("`poid` is null");
            return (Criteria) this;
        }

        public Criteria andPoidIsNotNull() {
            addCriterion("`poid` is not null");
            return (Criteria) this;
        }

        public Criteria andPoidEqualTo(Integer value) {
            addCriterion("`poid` =", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotEqualTo(Integer value) {
            addCriterion("`poid` <>", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThan(Integer value) {
            addCriterion("`poid` >", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`poid` >=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThan(Integer value) {
            addCriterion("`poid` <", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThanOrEqualTo(Integer value) {
            addCriterion("`poid` <=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidIn(List<Integer> values) {
            addCriterion("`poid` in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotIn(List<Integer> values) {
            addCriterion("`poid` not in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidBetween(Integer value1, Integer value2) {
            addCriterion("`poid` between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotBetween(Integer value1, Integer value2) {
            addCriterion("`poid` not between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("`url` is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("`url` is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("`url` =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("`url` <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("`url` >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("`url` >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("`url` <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("`url` <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("`url` like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("`url` not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("`url` in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("`url` not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("`url` between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("`url` not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("`method` is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("`method` is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("`method` =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("`method` <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("`method` >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("`method` >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("`method` <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("`method` <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("`method` like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("`method` not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("`method` in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("`method` not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("`method` between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("`method` not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andPhridEqualTo(boolean condition, Long value) {
            if (condition) {
                addCriterion("`phrid` =", value, "phrid");
            }
            return (Criteria) this;
        }

        public Criteria andPhridGreaterThanOrEqualTo(boolean condition, Long value) {
            if (condition) {
                addCriterion("`phrid` >=", value, "phrid");
            }
            return (Criteria) this;
        }

        public Criteria andPhridIn(boolean condition, List<Long> value) {
            if (condition) {
                addCriterion("`phrid` in", value, "phrid");
            }
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`key` =", value, "key");
            }
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`key` >=", value, "key");
            }
            return (Criteria) this;
        }

        public Criteria andKeyIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`key` in", value, "key");
            }
            return (Criteria) this;
        }

        public Criteria andPoidEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`poid` =", value, "poid");
            }
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThanOrEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`poid` >=", value, "poid");
            }
            return (Criteria) this;
        }

        public Criteria andPoidIn(boolean condition, List<Integer> value) {
            if (condition) {
                addCriterion("`poid` in", value, "poid");
            }
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`url` =", value, "url");
            }
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`url` >=", value, "url");
            }
            return (Criteria) this;
        }

        public Criteria andUrlIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`url` in", value, "url");
            }
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`method` =", value, "method");
            }
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`method` >=", value, "method");
            }
            return (Criteria) this;
        }

        public Criteria andMethodIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`method` in", value, "method");
            }
            return (Criteria) this;
        }
    }

    /**
     * null<p/>
     * BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PluginHttpRequest
     * BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
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