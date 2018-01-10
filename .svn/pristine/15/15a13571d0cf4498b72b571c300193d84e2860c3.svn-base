package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class TwConsultAnswerCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TwConsultAnswerCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConsultIdIsNull() {
            addCriterion("consult_id is null");
            return (Criteria) this;
        }

        public Criteria andConsultIdIsNotNull() {
            addCriterion("consult_id is not null");
            return (Criteria) this;
        }

        public Criteria andConsultIdEqualTo(Long value) {
            addCriterion("consult_id =", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotEqualTo(Long value) {
            addCriterion("consult_id <>", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdGreaterThan(Long value) {
            addCriterion("consult_id >", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdGreaterThanOrEqualTo(Long value) {
            addCriterion("consult_id >=", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdLessThan(Long value) {
            addCriterion("consult_id <", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdLessThanOrEqualTo(Long value) {
            addCriterion("consult_id <=", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdIn(List<Long> values) {
            addCriterion("consult_id in", values, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotIn(List<Long> values) {
            addCriterion("consult_id not in", values, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdBetween(Long value1, Long value2) {
            addCriterion("consult_id between", value1, value2, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotBetween(Long value1, Long value2) {
            addCriterion("consult_id not between", value1, value2, "consultId");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Long value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Long value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Long value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Long value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Long value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Long> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Long> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Long value1, Long value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Long value1, Long value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNull() {
            addCriterion("form_type is null");
            return (Criteria) this;
        }

        public Criteria andFormTypeIsNotNull() {
            addCriterion("form_type is not null");
            return (Criteria) this;
        }

        public Criteria andFormTypeEqualTo(Integer value) {
            addCriterion("form_type =", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotEqualTo(Integer value) {
            addCriterion("form_type <>", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThan(Integer value) {
            addCriterion("form_type >", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_type >=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThan(Integer value) {
            addCriterion("form_type <", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeLessThanOrEqualTo(Integer value) {
            addCriterion("form_type <=", value, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeIn(List<Integer> values) {
            addCriterion("form_type in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotIn(List<Integer> values) {
            addCriterion("form_type not in", values, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeBetween(Integer value1, Integer value2) {
            addCriterion("form_type between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andFormTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("form_type not between", value1, value2, "formType");
            return (Criteria) this;
        }

        public Criteria andCountextIsNull() {
            addCriterion("countext is null");
            return (Criteria) this;
        }

        public Criteria andCountextIsNotNull() {
            addCriterion("countext is not null");
            return (Criteria) this;
        }

        public Criteria andCountextEqualTo(String value) {
            addCriterion("countext =", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotEqualTo(String value) {
            addCriterion("countext <>", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextGreaterThan(String value) {
            addCriterion("countext >", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextGreaterThanOrEqualTo(String value) {
            addCriterion("countext >=", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextLessThan(String value) {
            addCriterion("countext <", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextLessThanOrEqualTo(String value) {
            addCriterion("countext <=", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextLike(String value) {
            addCriterion("countext like", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotLike(String value) {
            addCriterion("countext not like", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextIn(List<String> values) {
            addCriterion("countext in", values, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotIn(List<String> values) {
            addCriterion("countext not in", values, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextBetween(String value1, String value2) {
            addCriterion("countext between", value1, value2, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotBetween(String value1, String value2) {
            addCriterion("countext not between", value1, value2, "countext");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCountextTypeIsNull() {
            addCriterion("countext_type is null");
            return (Criteria) this;
        }

        public Criteria andCountextTypeIsNotNull() {
            addCriterion("countext_type is not null");
            return (Criteria) this;
        }

        public Criteria andCountextTypeEqualTo(Integer value) {
            addCriterion("countext_type =", value, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeNotEqualTo(Integer value) {
            addCriterion("countext_type <>", value, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeGreaterThan(Integer value) {
            addCriterion("countext_type >", value, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("countext_type >=", value, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeLessThan(Integer value) {
            addCriterion("countext_type <", value, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeLessThanOrEqualTo(Integer value) {
            addCriterion("countext_type <=", value, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeIn(List<Integer> values) {
            addCriterion("countext_type in", values, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeNotIn(List<Integer> values) {
            addCriterion("countext_type not in", values, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeBetween(Integer value1, Integer value2) {
            addCriterion("countext_type between", value1, value2, "countextType");
            return (Criteria) this;
        }

        public Criteria andCountextTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("countext_type not between", value1, value2, "countextType");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Integer value) {
            addCriterion("is_read =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Integer value) {
            addCriterion("is_read <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Integer value) {
            addCriterion("is_read >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_read >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Integer value) {
            addCriterion("is_read <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Integer value) {
            addCriterion("is_read <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Integer> values) {
            addCriterion("is_read in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Integer> values) {
            addCriterion("is_read not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Integer value1, Integer value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andCountextLikeInsensitive(String value) {
            addCriterion("upper(countext) like", value.toUpperCase(), "countext");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(create_time) like", value.toUpperCase(), "createTime");
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