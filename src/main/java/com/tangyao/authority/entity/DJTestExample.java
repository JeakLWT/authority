package com.tangyao.authority.entity;

import java.util.ArrayList;
import java.util.List;

public class DJTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DJTestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andWokerIdIsNull() {
            addCriterion("woker_id is null");
            return (Criteria) this;
        }

        public Criteria andWokerIdIsNotNull() {
            addCriterion("woker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWokerIdEqualTo(String value) {
            addCriterion("woker_id =", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdNotEqualTo(String value) {
            addCriterion("woker_id <>", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdGreaterThan(String value) {
            addCriterion("woker_id >", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdGreaterThanOrEqualTo(String value) {
            addCriterion("woker_id >=", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdLessThan(String value) {
            addCriterion("woker_id <", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdLessThanOrEqualTo(String value) {
            addCriterion("woker_id <=", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdLike(String value) {
            addCriterion("woker_id like", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdNotLike(String value) {
            addCriterion("woker_id not like", value, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdIn(List<String> values) {
            addCriterion("woker_id in", values, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdNotIn(List<String> values) {
            addCriterion("woker_id not in", values, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdBetween(String value1, String value2) {
            addCriterion("woker_id between", value1, value2, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerIdNotBetween(String value1, String value2) {
            addCriterion("woker_id not between", value1, value2, "wokerId");
            return (Criteria) this;
        }

        public Criteria andWokerNameIsNull() {
            addCriterion("woker_name is null");
            return (Criteria) this;
        }

        public Criteria andWokerNameIsNotNull() {
            addCriterion("woker_name is not null");
            return (Criteria) this;
        }

        public Criteria andWokerNameEqualTo(String value) {
            addCriterion("woker_name =", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameNotEqualTo(String value) {
            addCriterion("woker_name <>", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameGreaterThan(String value) {
            addCriterion("woker_name >", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameGreaterThanOrEqualTo(String value) {
            addCriterion("woker_name >=", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameLessThan(String value) {
            addCriterion("woker_name <", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameLessThanOrEqualTo(String value) {
            addCriterion("woker_name <=", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameLike(String value) {
            addCriterion("woker_name like", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameNotLike(String value) {
            addCriterion("woker_name not like", value, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameIn(List<String> values) {
            addCriterion("woker_name in", values, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameNotIn(List<String> values) {
            addCriterion("woker_name not in", values, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameBetween(String value1, String value2) {
            addCriterion("woker_name between", value1, value2, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerNameNotBetween(String value1, String value2) {
            addCriterion("woker_name not between", value1, value2, "wokerName");
            return (Criteria) this;
        }

        public Criteria andWokerAgeIsNull() {
            addCriterion("woker_age is null");
            return (Criteria) this;
        }

        public Criteria andWokerAgeIsNotNull() {
            addCriterion("woker_age is not null");
            return (Criteria) this;
        }

        public Criteria andWokerAgeEqualTo(Integer value) {
            addCriterion("woker_age =", value, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeNotEqualTo(Integer value) {
            addCriterion("woker_age <>", value, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeGreaterThan(Integer value) {
            addCriterion("woker_age >", value, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("woker_age >=", value, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeLessThan(Integer value) {
            addCriterion("woker_age <", value, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeLessThanOrEqualTo(Integer value) {
            addCriterion("woker_age <=", value, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeIn(List<Integer> values) {
            addCriterion("woker_age in", values, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeNotIn(List<Integer> values) {
            addCriterion("woker_age not in", values, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeBetween(Integer value1, Integer value2) {
            addCriterion("woker_age between", value1, value2, "wokerAge");
            return (Criteria) this;
        }

        public Criteria andWokerAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("woker_age not between", value1, value2, "wokerAge");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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