package com.gb.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CharactersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CharactersExample() {
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

        public Criteria andChIdIsNull() {
            addCriterion("ch_id is null");
            return (Criteria) this;
        }

        public Criteria andChIdIsNotNull() {
            addCriterion("ch_id is not null");
            return (Criteria) this;
        }

        public Criteria andChIdEqualTo(Integer value) {
            addCriterion("ch_id =", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotEqualTo(Integer value) {
            addCriterion("ch_id <>", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdGreaterThan(Integer value) {
            addCriterion("ch_id >", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ch_id >=", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLessThan(Integer value) {
            addCriterion("ch_id <", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLessThanOrEqualTo(Integer value) {
            addCriterion("ch_id <=", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdIn(List<Integer> values) {
            addCriterion("ch_id in", values, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotIn(List<Integer> values) {
            addCriterion("ch_id not in", values, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdBetween(Integer value1, Integer value2) {
            addCriterion("ch_id between", value1, value2, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ch_id not between", value1, value2, "chId");
            return (Criteria) this;
        }

        public Criteria andChNameIsNull() {
            addCriterion("ch_name is null");
            return (Criteria) this;
        }

        public Criteria andChNameIsNotNull() {
            addCriterion("ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andChNameEqualTo(String value) {
            addCriterion("ch_name =", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotEqualTo(String value) {
            addCriterion("ch_name <>", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThan(String value) {
            addCriterion("ch_name >", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThanOrEqualTo(String value) {
            addCriterion("ch_name >=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThan(String value) {
            addCriterion("ch_name <", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThanOrEqualTo(String value) {
            addCriterion("ch_name <=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLike(String value) {
            addCriterion("ch_name like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotLike(String value) {
            addCriterion("ch_name not like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameIn(List<String> values) {
            addCriterion("ch_name in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotIn(List<String> values) {
            addCriterion("ch_name not in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameBetween(String value1, String value2) {
            addCriterion("ch_name between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotBetween(String value1, String value2) {
            addCriterion("ch_name not between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andChBirthdayIsNull() {
            addCriterion("ch_birthday is null");
            return (Criteria) this;
        }

        public Criteria andChBirthdayIsNotNull() {
            addCriterion("ch_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andChBirthdayEqualTo(Date value) {
            addCriterion("ch_birthday =", value, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayNotEqualTo(Date value) {
            addCriterion("ch_birthday <>", value, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayGreaterThan(Date value) {
            addCriterion("ch_birthday >", value, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("ch_birthday >=", value, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayLessThan(Date value) {
            addCriterion("ch_birthday <", value, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("ch_birthday <=", value, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayIn(List<Date> values) {
            addCriterion("ch_birthday in", values, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayNotIn(List<Date> values) {
            addCriterion("ch_birthday not in", values, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayBetween(Date value1, Date value2) {
            addCriterion("ch_birthday between", value1, value2, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("ch_birthday not between", value1, value2, "chBirthday");
            return (Criteria) this;
        }

        public Criteria andChBackIsNull() {
            addCriterion("ch_back is null");
            return (Criteria) this;
        }

        public Criteria andChBackIsNotNull() {
            addCriterion("ch_back is not null");
            return (Criteria) this;
        }

        public Criteria andChBackEqualTo(String value) {
            addCriterion("ch_back =", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackNotEqualTo(String value) {
            addCriterion("ch_back <>", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackGreaterThan(String value) {
            addCriterion("ch_back >", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackGreaterThanOrEqualTo(String value) {
            addCriterion("ch_back >=", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackLessThan(String value) {
            addCriterion("ch_back <", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackLessThanOrEqualTo(String value) {
            addCriterion("ch_back <=", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackLike(String value) {
            addCriterion("ch_back like", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackNotLike(String value) {
            addCriterion("ch_back not like", value, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackIn(List<String> values) {
            addCriterion("ch_back in", values, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackNotIn(List<String> values) {
            addCriterion("ch_back not in", values, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackBetween(String value1, String value2) {
            addCriterion("ch_back between", value1, value2, "chBack");
            return (Criteria) this;
        }

        public Criteria andChBackNotBetween(String value1, String value2) {
            addCriterion("ch_back not between", value1, value2, "chBack");
            return (Criteria) this;
        }

        public Criteria andChAniIsNull() {
            addCriterion("ch_ani is null");
            return (Criteria) this;
        }

        public Criteria andChAniIsNotNull() {
            addCriterion("ch_ani is not null");
            return (Criteria) this;
        }

        public Criteria andChAniEqualTo(String value) {
            addCriterion("ch_ani =", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniNotEqualTo(String value) {
            addCriterion("ch_ani <>", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniGreaterThan(String value) {
            addCriterion("ch_ani >", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniGreaterThanOrEqualTo(String value) {
            addCriterion("ch_ani >=", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniLessThan(String value) {
            addCriterion("ch_ani <", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniLessThanOrEqualTo(String value) {
            addCriterion("ch_ani <=", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniLike(String value) {
            addCriterion("ch_ani like", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniNotLike(String value) {
            addCriterion("ch_ani not like", value, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniIn(List<String> values) {
            addCriterion("ch_ani in", values, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniNotIn(List<String> values) {
            addCriterion("ch_ani not in", values, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniBetween(String value1, String value2) {
            addCriterion("ch_ani between", value1, value2, "chAni");
            return (Criteria) this;
        }

        public Criteria andChAniNotBetween(String value1, String value2) {
            addCriterion("ch_ani not between", value1, value2, "chAni");
            return (Criteria) this;
        }

        public Criteria andChImgIsNull() {
            addCriterion("ch_img is null");
            return (Criteria) this;
        }

        public Criteria andChImgIsNotNull() {
            addCriterion("ch_img is not null");
            return (Criteria) this;
        }

        public Criteria andChImgEqualTo(String value) {
            addCriterion("ch_img =", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgNotEqualTo(String value) {
            addCriterion("ch_img <>", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgGreaterThan(String value) {
            addCriterion("ch_img >", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgGreaterThanOrEqualTo(String value) {
            addCriterion("ch_img >=", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgLessThan(String value) {
            addCriterion("ch_img <", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgLessThanOrEqualTo(String value) {
            addCriterion("ch_img <=", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgLike(String value) {
            addCriterion("ch_img like", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgNotLike(String value) {
            addCriterion("ch_img not like", value, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgIn(List<String> values) {
            addCriterion("ch_img in", values, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgNotIn(List<String> values) {
            addCriterion("ch_img not in", values, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgBetween(String value1, String value2) {
            addCriterion("ch_img between", value1, value2, "chImg");
            return (Criteria) this;
        }

        public Criteria andChImgNotBetween(String value1, String value2) {
            addCriterion("ch_img not between", value1, value2, "chImg");
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