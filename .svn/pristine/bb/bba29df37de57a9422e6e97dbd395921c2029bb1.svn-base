package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class XtCommonDiseaseCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtCommonDiseaseCriteria() {
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

        public Criteria andDisIdIsNull() {
            addCriterion("dis_id is null");
            return (Criteria) this;
        }

        public Criteria andDisIdIsNotNull() {
            addCriterion("dis_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisIdEqualTo(String value) {
            addCriterion("dis_id =", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotEqualTo(String value) {
            addCriterion("dis_id <>", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdGreaterThan(String value) {
            addCriterion("dis_id >", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdGreaterThanOrEqualTo(String value) {
            addCriterion("dis_id >=", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLessThan(String value) {
            addCriterion("dis_id <", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLessThanOrEqualTo(String value) {
            addCriterion("dis_id <=", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLike(String value) {
            addCriterion("dis_id like", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotLike(String value) {
            addCriterion("dis_id not like", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdIn(List<String> values) {
            addCriterion("dis_id in", values, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotIn(List<String> values) {
            addCriterion("dis_id not in", values, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdBetween(String value1, String value2) {
            addCriterion("dis_id between", value1, value2, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotBetween(String value1, String value2) {
            addCriterion("dis_id not between", value1, value2, "disId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdIsNull() {
            addCriterion("specialty_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdIsNotNull() {
            addCriterion("specialty_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdEqualTo(String value) {
            addCriterion("specialty_id =", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotEqualTo(String value) {
            addCriterion("specialty_id <>", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdGreaterThan(String value) {
            addCriterion("specialty_id >", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdGreaterThanOrEqualTo(String value) {
            addCriterion("specialty_id >=", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLessThan(String value) {
            addCriterion("specialty_id <", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLessThanOrEqualTo(String value) {
            addCriterion("specialty_id <=", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLike(String value) {
            addCriterion("specialty_id like", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotLike(String value) {
            addCriterion("specialty_id not like", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdIn(List<String> values) {
            addCriterion("specialty_id in", values, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotIn(List<String> values) {
            addCriterion("specialty_id not in", values, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdBetween(String value1, String value2) {
            addCriterion("specialty_id between", value1, value2, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotBetween(String value1, String value2) {
            addCriterion("specialty_id not between", value1, value2, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNull() {
            addCriterion("dis_name is null");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNotNull() {
            addCriterion("dis_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisNameEqualTo(String value) {
            addCriterion("dis_name =", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotEqualTo(String value) {
            addCriterion("dis_name <>", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThan(String value) {
            addCriterion("dis_name >", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThanOrEqualTo(String value) {
            addCriterion("dis_name >=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThan(String value) {
            addCriterion("dis_name <", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThanOrEqualTo(String value) {
            addCriterion("dis_name <=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLike(String value) {
            addCriterion("dis_name like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotLike(String value) {
            addCriterion("dis_name not like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameIn(List<String> values) {
            addCriterion("dis_name in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotIn(List<String> values) {
            addCriterion("dis_name not in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameBetween(String value1, String value2) {
            addCriterion("dis_name between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotBetween(String value1, String value2) {
            addCriterion("dis_name not between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIsNull() {
            addCriterion("icd_code is null");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIsNotNull() {
            addCriterion("icd_code is not null");
            return (Criteria) this;
        }

        public Criteria andIcdCodeEqualTo(String value) {
            addCriterion("icd_code =", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotEqualTo(String value) {
            addCriterion("icd_code <>", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeGreaterThan(String value) {
            addCriterion("icd_code >", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("icd_code >=", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLessThan(String value) {
            addCriterion("icd_code <", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLessThanOrEqualTo(String value) {
            addCriterion("icd_code <=", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLike(String value) {
            addCriterion("icd_code like", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotLike(String value) {
            addCriterion("icd_code not like", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIn(List<String> values) {
            addCriterion("icd_code in", values, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotIn(List<String> values) {
            addCriterion("icd_code not in", values, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeBetween(String value1, String value2) {
            addCriterion("icd_code between", value1, value2, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotBetween(String value1, String value2) {
            addCriterion("icd_code not between", value1, value2, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNull() {
            addCriterion("is_flag is null");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNotNull() {
            addCriterion("is_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIsFlagEqualTo(Integer value) {
            addCriterion("is_flag =", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotEqualTo(Integer value) {
            addCriterion("is_flag <>", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThan(Integer value) {
            addCriterion("is_flag >", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_flag >=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThan(Integer value) {
            addCriterion("is_flag <", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThanOrEqualTo(Integer value) {
            addCriterion("is_flag <=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagIn(List<Integer> values) {
            addCriterion("is_flag in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotIn(List<Integer> values) {
            addCriterion("is_flag not in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagBetween(Integer value1, Integer value2) {
            addCriterion("is_flag between", value1, value2, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("is_flag not between", value1, value2, "isFlag");
            return (Criteria) this;
        }

        public Criteria andDisIdLikeInsensitive(String value) {
            addCriterion("upper(dis_id) like", value.toUpperCase(), "disId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLikeInsensitive(String value) {
            addCriterion("upper(specialty_id) like", value.toUpperCase(), "specialtyId");
            return (Criteria) this;
        }

        public Criteria andDisNameLikeInsensitive(String value) {
            addCriterion("upper(dis_name) like", value.toUpperCase(), "disName");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLikeInsensitive(String value) {
            addCriterion("upper(icd_code) like", value.toUpperCase(), "icdCode");
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