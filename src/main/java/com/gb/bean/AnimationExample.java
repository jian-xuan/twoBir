package com.gb.bean;

import java.util.ArrayList;
import java.util.List;

public class AnimationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimationExample() {
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

        public Criteria andAniIdIsNull() {
            addCriterion("ani_id is null");
            return (Criteria) this;
        }

        public Criteria andAniIdIsNotNull() {
            addCriterion("ani_id is not null");
            return (Criteria) this;
        }

        public Criteria andAniIdEqualTo(Integer value) {
            addCriterion("ani_id =", value, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdNotEqualTo(Integer value) {
            addCriterion("ani_id <>", value, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdGreaterThan(Integer value) {
            addCriterion("ani_id >", value, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ani_id >=", value, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdLessThan(Integer value) {
            addCriterion("ani_id <", value, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdLessThanOrEqualTo(Integer value) {
            addCriterion("ani_id <=", value, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdIn(List<Integer> values) {
            addCriterion("ani_id in", values, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdNotIn(List<Integer> values) {
            addCriterion("ani_id not in", values, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdBetween(Integer value1, Integer value2) {
            addCriterion("ani_id between", value1, value2, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ani_id not between", value1, value2, "aniId");
            return (Criteria) this;
        }

        public Criteria andAniNameIsNull() {
            addCriterion("ani_name is null");
            return (Criteria) this;
        }

        public Criteria andAniNameIsNotNull() {
            addCriterion("ani_name is not null");
            return (Criteria) this;
        }

        public Criteria andAniNameEqualTo(String value) {
            addCriterion("ani_name =", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameNotEqualTo(String value) {
            addCriterion("ani_name <>", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameGreaterThan(String value) {
            addCriterion("ani_name >", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameGreaterThanOrEqualTo(String value) {
            addCriterion("ani_name >=", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameLessThan(String value) {
            addCriterion("ani_name <", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameLessThanOrEqualTo(String value) {
            addCriterion("ani_name <=", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameLike(String value) {
            addCriterion("ani_name like", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameNotLike(String value) {
            addCriterion("ani_name not like", value, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameIn(List<String> values) {
            addCriterion("ani_name in", values, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameNotIn(List<String> values) {
            addCriterion("ani_name not in", values, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameBetween(String value1, String value2) {
            addCriterion("ani_name between", value1, value2, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniNameNotBetween(String value1, String value2) {
            addCriterion("ani_name not between", value1, value2, "aniName");
            return (Criteria) this;
        }

        public Criteria andAniDestIsNull() {
            addCriterion("ani_dest is null");
            return (Criteria) this;
        }

        public Criteria andAniDestIsNotNull() {
            addCriterion("ani_dest is not null");
            return (Criteria) this;
        }

        public Criteria andAniDestEqualTo(String value) {
            addCriterion("ani_dest =", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestNotEqualTo(String value) {
            addCriterion("ani_dest <>", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestGreaterThan(String value) {
            addCriterion("ani_dest >", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestGreaterThanOrEqualTo(String value) {
            addCriterion("ani_dest >=", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestLessThan(String value) {
            addCriterion("ani_dest <", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestLessThanOrEqualTo(String value) {
            addCriterion("ani_dest <=", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestLike(String value) {
            addCriterion("ani_dest like", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestNotLike(String value) {
            addCriterion("ani_dest not like", value, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestIn(List<String> values) {
            addCriterion("ani_dest in", values, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestNotIn(List<String> values) {
            addCriterion("ani_dest not in", values, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestBetween(String value1, String value2) {
            addCriterion("ani_dest between", value1, value2, "aniDest");
            return (Criteria) this;
        }

        public Criteria andAniDestNotBetween(String value1, String value2) {
            addCriterion("ani_dest not between", value1, value2, "aniDest");
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