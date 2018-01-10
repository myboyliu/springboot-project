package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class XtPersonCriteria{

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtPersonCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthdate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthdate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthdate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthdate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthdate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthdate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthdate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthdate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthdate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthdate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthdate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthdate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthdate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("marry is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("marry is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(Integer value) {
            addCriterion("marry =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(Integer value) {
            addCriterion("marry <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(Integer value) {
            addCriterion("marry >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(Integer value) {
            addCriterion("marry >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(Integer value) {
            addCriterion("marry <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(Integer value) {
            addCriterion("marry <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<Integer> values) {
            addCriterion("marry in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<Integer> values) {
            addCriterion("marry not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(Integer value1, Integer value2) {
            addCriterion("marry between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(Integer value1, Integer value2) {
            addCriterion("marry not between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNull() {
            addCriterion("birth_place is null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIsNotNull() {
            addCriterion("birth_place is not null");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceEqualTo(String value) {
            addCriterion("birth_place =", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotEqualTo(String value) {
            addCriterion("birth_place <>", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThan(String value) {
            addCriterion("birth_place >", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("birth_place >=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThan(String value) {
            addCriterion("birth_place <", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLessThanOrEqualTo(String value) {
            addCriterion("birth_place <=", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLike(String value) {
            addCriterion("birth_place like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotLike(String value) {
            addCriterion("birth_place not like", value, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceIn(List<String> values) {
            addCriterion("birth_place in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotIn(List<String> values) {
            addCriterion("birth_place not in", values, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceBetween(String value1, String value2) {
            addCriterion("birth_place between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceNotBetween(String value1, String value2) {
            addCriterion("birth_place not between", value1, value2, "birthPlace");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Long value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Long value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Long value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Long value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Long> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Long> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Long value1, Long value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIsNull() {
            addCriterion("occupation_id is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIsNotNull() {
            addCriterion("occupation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationIdEqualTo(Integer value) {
            addCriterion("occupation_id =", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotEqualTo(Integer value) {
            addCriterion("occupation_id <>", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThan(Integer value) {
            addCriterion("occupation_id >", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupation_id >=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThan(Integer value) {
            addCriterion("occupation_id <", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdLessThanOrEqualTo(Integer value) {
            addCriterion("occupation_id <=", value, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdIn(List<Integer> values) {
            addCriterion("occupation_id in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotIn(List<Integer> values) {
            addCriterion("occupation_id not in", values, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdBetween(Integer value1, Integer value2) {
            addCriterion("occupation_id between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andOccupationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("occupation_id not between", value1, value2, "occupationId");
            return (Criteria) this;
        }

        public Criteria andHomeTelIsNull() {
            addCriterion("home_tel is null");
            return (Criteria) this;
        }

        public Criteria andHomeTelIsNotNull() {
            addCriterion("home_tel is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTelEqualTo(String value) {
            addCriterion("home_tel =", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotEqualTo(String value) {
            addCriterion("home_tel <>", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelGreaterThan(String value) {
            addCriterion("home_tel >", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelGreaterThanOrEqualTo(String value) {
            addCriterion("home_tel >=", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLessThan(String value) {
            addCriterion("home_tel <", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLessThanOrEqualTo(String value) {
            addCriterion("home_tel <=", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLike(String value) {
            addCriterion("home_tel like", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotLike(String value) {
            addCriterion("home_tel not like", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelIn(List<String> values) {
            addCriterion("home_tel in", values, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotIn(List<String> values) {
            addCriterion("home_tel not in", values, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelBetween(String value1, String value2) {
            addCriterion("home_tel between", value1, value2, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotBetween(String value1, String value2) {
            addCriterion("home_tel not between", value1, value2, "homeTel");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeIsNull() {
            addCriterion("social_id_type is null");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeIsNotNull() {
            addCriterion("social_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeEqualTo(Integer value) {
            addCriterion("social_id_type =", value, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeNotEqualTo(Integer value) {
            addCriterion("social_id_type <>", value, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeGreaterThan(Integer value) {
            addCriterion("social_id_type >", value, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("social_id_type >=", value, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeLessThan(Integer value) {
            addCriterion("social_id_type <", value, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("social_id_type <=", value, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeIn(List<Integer> values) {
            addCriterion("social_id_type in", values, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeNotIn(List<Integer> values) {
            addCriterion("social_id_type not in", values, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeBetween(Integer value1, Integer value2) {
            addCriterion("social_id_type between", value1, value2, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("social_id_type not between", value1, value2, "socialIdType");
            return (Criteria) this;
        }

        public Criteria andSocialIdIsNull() {
            addCriterion("social_id is null");
            return (Criteria) this;
        }

        public Criteria andSocialIdIsNotNull() {
            addCriterion("social_id is not null");
            return (Criteria) this;
        }

        public Criteria andSocialIdEqualTo(String value) {
            addCriterion("social_id =", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotEqualTo(String value) {
            addCriterion("social_id <>", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdGreaterThan(String value) {
            addCriterion("social_id >", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdGreaterThanOrEqualTo(String value) {
            addCriterion("social_id >=", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLessThan(String value) {
            addCriterion("social_id <", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLessThanOrEqualTo(String value) {
            addCriterion("social_id <=", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdLike(String value) {
            addCriterion("social_id like", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotLike(String value) {
            addCriterion("social_id not like", value, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdIn(List<String> values) {
            addCriterion("social_id in", values, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotIn(List<String> values) {
            addCriterion("social_id not in", values, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdBetween(String value1, String value2) {
            addCriterion("social_id between", value1, value2, "socialId");
            return (Criteria) this;
        }

        public Criteria andSocialIdNotBetween(String value1, String value2) {
            addCriterion("social_id not between", value1, value2, "socialId");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIsNull() {
            addCriterion("allergic_history is null");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIsNotNull() {
            addCriterion("allergic_history is not null");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryEqualTo(String value) {
            addCriterion("allergic_history =", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotEqualTo(String value) {
            addCriterion("allergic_history <>", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryGreaterThan(String value) {
            addCriterion("allergic_history >", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("allergic_history >=", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLessThan(String value) {
            addCriterion("allergic_history <", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLessThanOrEqualTo(String value) {
            addCriterion("allergic_history <=", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLike(String value) {
            addCriterion("allergic_history like", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotLike(String value) {
            addCriterion("allergic_history not like", value, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryIn(List<String> values) {
            addCriterion("allergic_history in", values, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotIn(List<String> values) {
            addCriterion("allergic_history not in", values, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryBetween(String value1, String value2) {
            addCriterion("allergic_history between", value1, value2, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryNotBetween(String value1, String value2) {
            addCriterion("allergic_history not between", value1, value2, "allergicHistory");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andBirthdateLikeInsensitive(String value) {
            addCriterion("upper(birthdate) like", value.toUpperCase(), "birthdate");
            return (Criteria) this;
        }

        public Criteria andNationLikeInsensitive(String value) {
            addCriterion("upper(nation) like", value.toUpperCase(), "nation");
            return (Criteria) this;
        }

        public Criteria andBirthPlaceLikeInsensitive(String value) {
            addCriterion("upper(birth_place) like", value.toUpperCase(), "birthPlace");
            return (Criteria) this;
        }

        public Criteria andHomeTelLikeInsensitive(String value) {
            addCriterion("upper(home_tel) like", value.toUpperCase(), "homeTel");
            return (Criteria) this;
        }

        public Criteria andSocialIdLikeInsensitive(String value) {
            addCriterion("upper(social_id) like", value.toUpperCase(), "socialId");
            return (Criteria) this;
        }

        public Criteria andAllergicHistoryLikeInsensitive(String value) {
            addCriterion("upper(allergic_history) like", value.toUpperCase(), "allergicHistory");
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