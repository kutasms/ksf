/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.database.mysql.pojo;

import java.util.ArrayList;
import java.util.List;

public class PluginScriptRelExample {
    /**
     * @date 2021-03-24 18:00:39
     */
    protected String orderByClause;

    /**
     * @date 2021-03-24 18:00:39
     */
    protected boolean distinct;

    /**
     * @date 2021-03-24 18:00:39
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public PluginScriptRelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
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
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * PluginScriptRel
     * BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
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

        public Criteria andPidIsNull() {
            addCriterion("`pid` is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("`pid` is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("`pid` =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("`pid` <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("`pid` >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`pid` >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("`pid` <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("`pid` <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("`pid` in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("`pid` not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("`pid` between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("`pid` not between", value1, value2, "pid");
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

        public Criteria andOidEqualTo(Long value) {
            addCriterion("`oid` =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("`oid` <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("`oid` >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("`oid` >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("`oid` <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("`oid` <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("`oid` in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("`oid` not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("`oid` between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("`oid` not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andIndexIsNull() {
            addCriterion("`index` is null");
            return (Criteria) this;
        }

        public Criteria andIndexIsNotNull() {
            addCriterion("`index` is not null");
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(Short value) {
            addCriterion("`index` =", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotEqualTo(Short value) {
            addCriterion("`index` <>", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThan(Short value) {
            addCriterion("`index` >", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(Short value) {
            addCriterion("`index` >=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThan(Short value) {
            addCriterion("`index` <", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexLessThanOrEqualTo(Short value) {
            addCriterion("`index` <=", value, "index");
            return (Criteria) this;
        }

        public Criteria andIndexIn(List<Short> values) {
            addCriterion("`index` in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotIn(List<Short> values) {
            addCriterion("`index` not in", values, "index");
            return (Criteria) this;
        }

        public Criteria andIndexBetween(Short value1, Short value2) {
            addCriterion("`index` between", value1, value2, "index");
            return (Criteria) this;
        }

        public Criteria andIndexNotBetween(Short value1, Short value2) {
            addCriterion("`index` not between", value1, value2, "index");
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

        public Criteria andBackupOidIsNull() {
            addCriterion("`backup_oid` is null");
            return (Criteria) this;
        }

        public Criteria andBackupOidIsNotNull() {
            addCriterion("`backup_oid` is not null");
            return (Criteria) this;
        }

        public Criteria andBackupOidEqualTo(String value) {
            addCriterion("`backup_oid` =", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidNotEqualTo(String value) {
            addCriterion("`backup_oid` <>", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidGreaterThan(String value) {
            addCriterion("`backup_oid` >", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidGreaterThanOrEqualTo(String value) {
            addCriterion("`backup_oid` >=", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidLessThan(String value) {
            addCriterion("`backup_oid` <", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidLessThanOrEqualTo(String value) {
            addCriterion("`backup_oid` <=", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidLike(String value) {
            addCriterion("`backup_oid` like", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidNotLike(String value) {
            addCriterion("`backup_oid` not like", value, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidIn(List<String> values) {
            addCriterion("`backup_oid` in", values, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidNotIn(List<String> values) {
            addCriterion("`backup_oid` not in", values, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidBetween(String value1, String value2) {
            addCriterion("`backup_oid` between", value1, value2, "backupOid");
            return (Criteria) this;
        }

        public Criteria andBackupOidNotBetween(String value1, String value2) {
            addCriterion("`backup_oid` not between", value1, value2, "backupOid");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`pid` =", value, "pid");
            }
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(boolean condition, Integer value) {
            if (condition) {
                addCriterion("`pid` >=", value, "pid");
            }
            return (Criteria) this;
        }

        public Criteria andPidIn(boolean condition, List<Integer> value) {
            if (condition) {
                addCriterion("`pid` in", value, "pid");
            }
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(boolean condition, Long value) {
            if (condition) {
                addCriterion("`oid` =", value, "oid");
            }
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(boolean condition, Long value) {
            if (condition) {
                addCriterion("`oid` >=", value, "oid");
            }
            return (Criteria) this;
        }

        public Criteria andOidIn(boolean condition, List<Long> value) {
            if (condition) {
                addCriterion("`oid` in", value, "oid");
            }
            return (Criteria) this;
        }

        public Criteria andIndexEqualTo(boolean condition, Short value) {
            if (condition) {
                addCriterion("`index` =", value, "index");
            }
            return (Criteria) this;
        }

        public Criteria andIndexGreaterThanOrEqualTo(boolean condition, Short value) {
            if (condition) {
                addCriterion("`index` >=", value, "index");
            }
            return (Criteria) this;
        }

        public Criteria andIndexIn(boolean condition, List<Short> value) {
            if (condition) {
                addCriterion("`index` in", value, "index");
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

        public Criteria andBackupOidEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`backup_oid` =", value, "backupOid");
            }
            return (Criteria) this;
        }

        public Criteria andBackupOidGreaterThanOrEqualTo(boolean condition, String value) {
            if (condition) {
                addCriterion("`backup_oid` >=", value, "backupOid");
            }
            return (Criteria) this;
        }

        public Criteria andBackupOidIn(boolean condition, List<String> value) {
            if (condition) {
                addCriterion("`backup_oid` in", value, "backupOid");
            }
            return (Criteria) this;
        }
    }

    /**
     * null<p/>
     * BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * PluginScriptRel
     * BS_Plugin_Script_Rel
     * @date 2021-03-24 18:00:39
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