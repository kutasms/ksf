/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScriptCategoryExample {
    /**
     * @date 2021-11-18 12:08:30
     */
    protected String orderByClause;

    /**
     * @date 2021-11-18 12:08:30
     */
    protected boolean distinct;

    /**
     * @date 2021-11-18 12:08:30
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public ScriptCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
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
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ScriptCategory
     * BS_Script_Category
     * @date 2021-11-18 12:08:30
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

        public Criteria andCidIsNull() {
            addCriterion("`cid` is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("`cid` is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("`cid` =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("`cid` <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("`cid` >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`cid` >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("`cid` <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("`cid` <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("`cid` in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("`cid` not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("`cid` between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("`cid` not between", value1, value2, "cid");
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

        public Criteria andParentCidIsNull() {
            addCriterion("`parent_cid` is null");
            return (Criteria) this;
        }

        public Criteria andParentCidIsNotNull() {
            addCriterion("`parent_cid` is not null");
            return (Criteria) this;
        }

        public Criteria andParentCidEqualTo(Integer value) {
            addCriterion("`parent_cid` =", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidNotEqualTo(Integer value) {
            addCriterion("`parent_cid` <>", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidGreaterThan(Integer value) {
            addCriterion("`parent_cid` >", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`parent_cid` >=", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidLessThan(Integer value) {
            addCriterion("`parent_cid` <", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidLessThanOrEqualTo(Integer value) {
            addCriterion("`parent_cid` <=", value, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidIn(List<Integer> values) {
            addCriterion("`parent_cid` in", values, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidNotIn(List<Integer> values) {
            addCriterion("`parent_cid` not in", values, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidBetween(Integer value1, Integer value2) {
            addCriterion("`parent_cid` between", value1, value2, "parentCid");
            return (Criteria) this;
        }

        public Criteria andParentCidNotBetween(Integer value1, Integer value2) {
            addCriterion("`parent_cid` not between", value1, value2, "parentCid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("`level` like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("`level` not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDeepIsNull() {
            addCriterion("`deep` is null");
            return (Criteria) this;
        }

        public Criteria andDeepIsNotNull() {
            addCriterion("`deep` is not null");
            return (Criteria) this;
        }

        public Criteria andDeepEqualTo(Short value) {
            addCriterion("`deep` =", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepNotEqualTo(Short value) {
            addCriterion("`deep` <>", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepGreaterThan(Short value) {
            addCriterion("`deep` >", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepGreaterThanOrEqualTo(Short value) {
            addCriterion("`deep` >=", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepLessThan(Short value) {
            addCriterion("`deep` <", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepLessThanOrEqualTo(Short value) {
            addCriterion("`deep` <=", value, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepIn(List<Short> values) {
            addCriterion("`deep` in", values, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepNotIn(List<Short> values) {
            addCriterion("`deep` not in", values, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepBetween(Short value1, Short value2) {
            addCriterion("`deep` between", value1, value2, "deep");
            return (Criteria) this;
        }

        public Criteria andDeepNotBetween(Short value1, Short value2) {
            addCriterion("`deep` not between", value1, value2, "deep");
            return (Criteria) this;
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

        public Criteria andCidEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`cid` =", value, "cid");
            }
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`cid` >=", value, "cid");
            }
            return (Criteria) this;
        }

        public Criteria andCidIn(boolean condition, List<Integer> value) {
            if (condition) {
                addCriterion("`cid` in", value, "cid");
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

        public Criteria andParentCidEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`parent_cid` =", value, "parentCid");
            }
            return (Criteria) this;
        }

        public Criteria andParentCidGreaterThanOrEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`parent_cid` >=", value, "parentCid");
            }
            return (Criteria) this;
        }

        public Criteria andParentCidIn(boolean condition, List<Integer> value) {
            if (condition) {
                addCriterion("`parent_cid` in", value, "parentCid");
            }
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`level` =", value, "level");
            }
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`level` >=", value, "level");
            }
            return (Criteria) this;
        }

        public Criteria andLevelIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`level` in", value, "level");
            }
            return (Criteria) this;
        }

        public Criteria andDeepEqualTo(boolean condition, Short value) {
            if (condition) {
                addCriterion("`deep` =", value, "deep");
            }
            return (Criteria) this;
        }

        public Criteria andDeepGreaterThanOrEqualTo(boolean condition, Short value) {
            if (condition) {
                addCriterion("`deep` >=", value, "deep");
            }
            return (Criteria) this;
        }

        public Criteria andDeepIn(boolean condition, List<Short> value) {
            if (condition) {
                addCriterion("`deep` in", value, "deep");
            }
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
    }

    /**
     * null<p/>
     * BS_Script_Category
     * @date 2021-11-18 12:08:30
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ScriptCategory
     * BS_Script_Category
     * @date 2021-11-18 12:08:30
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