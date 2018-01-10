package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.huatuo.customer.base.domain.AbstractCriteria;


public class MzVisitCriteria extends AbstractCriteria{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3737739960764389148L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MzVisitCriteria() {
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

        public Criteria andMzCodeIsNull() {
            addCriterion("mz_code is null");
            return (Criteria) this;
        }

        public Criteria andMzCodeIsNotNull() {
            addCriterion("mz_code is not null");
            return (Criteria) this;
        }

        public Criteria andMzCodeEqualTo(String value) {
            addCriterion("mz_code =", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeNotEqualTo(String value) {
            addCriterion("mz_code <>", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeGreaterThan(String value) {
            addCriterion("mz_code >", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mz_code >=", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeLessThan(String value) {
            addCriterion("mz_code <", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeLessThanOrEqualTo(String value) {
            addCriterion("mz_code <=", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeLike(String value) {
            addCriterion("mz_code like", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeNotLike(String value) {
            addCriterion("mz_code not like", value, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeIn(List<String> values) {
            addCriterion("mz_code in", values, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeNotIn(List<String> values) {
            addCriterion("mz_code not in", values, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeBetween(String value1, String value2) {
            addCriterion("mz_code between", value1, value2, "mzCode");
            return (Criteria) this;
        }

        public Criteria andMzCodeNotBetween(String value1, String value2) {
            addCriterion("mz_code not between", value1, value2, "mzCode");
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andSelfFlagIsNull() {
            addCriterion("self_flag is null");
            return (Criteria) this;
        }

        public Criteria andSelfFlagIsNotNull() {
            addCriterion("self_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSelfFlagEqualTo(Integer value) {
            addCriterion("self_flag =", value, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagNotEqualTo(Integer value) {
            addCriterion("self_flag <>", value, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagGreaterThan(Integer value) {
            addCriterion("self_flag >", value, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_flag >=", value, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagLessThan(Integer value) {
            addCriterion("self_flag <", value, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagLessThanOrEqualTo(Integer value) {
            addCriterion("self_flag <=", value, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagIn(List<Integer> values) {
            addCriterion("self_flag in", values, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagNotIn(List<Integer> values) {
            addCriterion("self_flag not in", values, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagBetween(Integer value1, Integer value2) {
            addCriterion("self_flag between", value1, value2, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andSelfFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("self_flag not between", value1, value2, "selfFlag");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Long value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Long value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Long value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Long value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Long value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Long> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Long> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Long value1, Long value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Long value1, Long value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(String value) {
            addCriterion("visit_time =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(String value) {
            addCriterion("visit_time <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(String value) {
            addCriterion("visit_time >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_time >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(String value) {
            addCriterion("visit_time <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(String value) {
            addCriterion("visit_time <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLike(String value) {
            addCriterion("visit_time like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotLike(String value) {
            addCriterion("visit_time not like", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<String> values) {
            addCriterion("visit_time in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<String> values) {
            addCriterion("visit_time not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(String value1, String value2) {
            addCriterion("visit_time between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(String value1, String value2) {
            addCriterion("visit_time not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Long value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Long value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Long value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Long value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Long value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Long> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Long> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Long value1, Long value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Long value1, Long value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andServiceCostIsNull() {
            addCriterion("service_cost is null");
            return (Criteria) this;
        }

        public Criteria andServiceCostIsNotNull() {
            addCriterion("service_cost is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCostEqualTo(BigDecimal value) {
            addCriterion("service_cost =", value, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostNotEqualTo(BigDecimal value) {
            addCriterion("service_cost <>", value, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostGreaterThan(BigDecimal value) {
            addCriterion("service_cost >", value, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_cost >=", value, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostLessThan(BigDecimal value) {
            addCriterion("service_cost <", value, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_cost <=", value, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostIn(List<BigDecimal> values) {
            addCriterion("service_cost in", values, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostNotIn(List<BigDecimal> values) {
            addCriterion("service_cost not in", values, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_cost between", value1, value2, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andServiceCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_cost not between", value1, value2, "serviceCost");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIsNull() {
            addCriterion("VISIT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIsNotNull() {
            addCriterion("VISIT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDeptEqualTo(String value) {
            addCriterion("VISIT_DEPT =", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotEqualTo(String value) {
            addCriterion("VISIT_DEPT <>", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptGreaterThan(String value) {
            addCriterion("VISIT_DEPT >", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_DEPT >=", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLessThan(String value) {
            addCriterion("VISIT_DEPT <", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLessThanOrEqualTo(String value) {
            addCriterion("VISIT_DEPT <=", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLike(String value) {
            addCriterion("VISIT_DEPT like", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotLike(String value) {
            addCriterion("VISIT_DEPT not like", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIn(List<String> values) {
            addCriterion("VISIT_DEPT in", values, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotIn(List<String> values) {
            addCriterion("VISIT_DEPT not in", values, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptBetween(String value1, String value2) {
            addCriterion("VISIT_DEPT between", value1, value2, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotBetween(String value1, String value2) {
            addCriterion("VISIT_DEPT not between", value1, value2, "visitDept");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNull() {
            addCriterion("visit_type is null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNotNull() {
            addCriterion("visit_type is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeEqualTo(Integer value) {
            addCriterion("visit_type =", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotEqualTo(Integer value) {
            addCriterion("visit_type <>", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThan(Integer value) {
            addCriterion("visit_type >", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_type >=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThan(Integer value) {
            addCriterion("visit_type <", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThanOrEqualTo(Integer value) {
            addCriterion("visit_type <=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIn(List<Integer> values) {
            addCriterion("visit_type in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotIn(List<Integer> values) {
            addCriterion("visit_type not in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeBetween(Integer value1, Integer value2) {
            addCriterion("visit_type between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_type not between", value1, value2, "visitType");
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

        public Criteria andRStartTimeIsNull() {
            addCriterion("r_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRStartTimeIsNotNull() {
            addCriterion("r_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRStartTimeEqualTo(String value) {
            addCriterion("r_start_time =", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeNotEqualTo(String value) {
            addCriterion("r_start_time <>", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeGreaterThan(String value) {
            addCriterion("r_start_time >", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("r_start_time >=", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeLessThan(String value) {
            addCriterion("r_start_time <", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeLessThanOrEqualTo(String value) {
            addCriterion("r_start_time <=", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeLike(String value) {
            addCriterion("r_start_time like", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeNotLike(String value) {
            addCriterion("r_start_time not like", value, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeIn(List<String> values) {
            addCriterion("r_start_time in", values, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeNotIn(List<String> values) {
            addCriterion("r_start_time not in", values, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeBetween(String value1, String value2) {
            addCriterion("r_start_time between", value1, value2, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeNotBetween(String value1, String value2) {
            addCriterion("r_start_time not between", value1, value2, "rStartTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeIsNull() {
            addCriterion("r_end_time is null");
            return (Criteria) this;
        }

        public Criteria andREndTimeIsNotNull() {
            addCriterion("r_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andREndTimeEqualTo(String value) {
            addCriterion("r_end_time =", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeNotEqualTo(String value) {
            addCriterion("r_end_time <>", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeGreaterThan(String value) {
            addCriterion("r_end_time >", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("r_end_time >=", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeLessThan(String value) {
            addCriterion("r_end_time <", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeLessThanOrEqualTo(String value) {
            addCriterion("r_end_time <=", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeLike(String value) {
            addCriterion("r_end_time like", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeNotLike(String value) {
            addCriterion("r_end_time not like", value, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeIn(List<String> values) {
            addCriterion("r_end_time in", values, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeNotIn(List<String> values) {
            addCriterion("r_end_time not in", values, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeBetween(String value1, String value2) {
            addCriterion("r_end_time between", value1, value2, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeNotBetween(String value1, String value2) {
            addCriterion("r_end_time not between", value1, value2, "rEndTime");
            return (Criteria) this;
        }

        public Criteria andReservationNumIsNull() {
            addCriterion("reservation_num is null");
            return (Criteria) this;
        }

        public Criteria andReservationNumIsNotNull() {
            addCriterion("reservation_num is not null");
            return (Criteria) this;
        }

        public Criteria andReservationNumEqualTo(Integer value) {
            addCriterion("reservation_num =", value, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumNotEqualTo(Integer value) {
            addCriterion("reservation_num <>", value, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumGreaterThan(Integer value) {
            addCriterion("reservation_num >", value, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reservation_num >=", value, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumLessThan(Integer value) {
            addCriterion("reservation_num <", value, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumLessThanOrEqualTo(Integer value) {
            addCriterion("reservation_num <=", value, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumIn(List<Integer> values) {
            addCriterion("reservation_num in", values, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumNotIn(List<Integer> values) {
            addCriterion("reservation_num not in", values, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumBetween(Integer value1, Integer value2) {
            addCriterion("reservation_num between", value1, value2, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reservation_num not between", value1, value2, "reservationNum");
            return (Criteria) this;
        }

        public Criteria andReservationTaskIsNull() {
            addCriterion("reservation_task is null");
            return (Criteria) this;
        }

        public Criteria andReservationTaskIsNotNull() {
            addCriterion("reservation_task is not null");
            return (Criteria) this;
        }

        public Criteria andReservationTaskEqualTo(Integer value) {
            addCriterion("reservation_task =", value, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskNotEqualTo(Integer value) {
            addCriterion("reservation_task <>", value, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskGreaterThan(Integer value) {
            addCriterion("reservation_task >", value, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("reservation_task >=", value, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskLessThan(Integer value) {
            addCriterion("reservation_task <", value, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskLessThanOrEqualTo(Integer value) {
            addCriterion("reservation_task <=", value, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskIn(List<Integer> values) {
            addCriterion("reservation_task in", values, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskNotIn(List<Integer> values) {
            addCriterion("reservation_task not in", values, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskBetween(Integer value1, Integer value2) {
            addCriterion("reservation_task between", value1, value2, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andReservationTaskNotBetween(Integer value1, Integer value2) {
            addCriterion("reservation_task not between", value1, value2, "reservationTask");
            return (Criteria) this;
        }

        public Criteria andTaskCidIsNull() {
            addCriterion("task_cid is null");
            return (Criteria) this;
        }

        public Criteria andTaskCidIsNotNull() {
            addCriterion("task_cid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCidEqualTo(Long value) {
            addCriterion("task_cid =", value, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidNotEqualTo(Long value) {
            addCriterion("task_cid <>", value, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidGreaterThan(Long value) {
            addCriterion("task_cid >", value, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidGreaterThanOrEqualTo(Long value) {
            addCriterion("task_cid >=", value, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidLessThan(Long value) {
            addCriterion("task_cid <", value, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidLessThanOrEqualTo(Long value) {
            addCriterion("task_cid <=", value, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidIn(List<Long> values) {
            addCriterion("task_cid in", values, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidNotIn(List<Long> values) {
            addCriterion("task_cid not in", values, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidBetween(Long value1, Long value2) {
            addCriterion("task_cid between", value1, value2, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskCidNotBetween(Long value1, Long value2) {
            addCriterion("task_cid not between", value1, value2, "taskCid");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIsNull() {
            addCriterion("task_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIsNotNull() {
            addCriterion("task_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEqualTo(String value) {
            addCriterion("task_time =", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotEqualTo(String value) {
            addCriterion("task_time <>", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeGreaterThan(String value) {
            addCriterion("task_time >", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_time >=", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLessThan(String value) {
            addCriterion("task_time <", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLessThanOrEqualTo(String value) {
            addCriterion("task_time <=", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLike(String value) {
            addCriterion("task_time like", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotLike(String value) {
            addCriterion("task_time not like", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIn(List<String> values) {
            addCriterion("task_time in", values, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotIn(List<String> values) {
            addCriterion("task_time not in", values, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeBetween(String value1, String value2) {
            addCriterion("task_time between", value1, value2, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotBetween(String value1, String value2) {
            addCriterion("task_time not between", value1, value2, "taskTime");
            return (Criteria) this;
        }

        public Criteria andReservationIdIsNull() {
            addCriterion("reservation_id is null");
            return (Criteria) this;
        }

        public Criteria andReservationIdIsNotNull() {
            addCriterion("reservation_id is not null");
            return (Criteria) this;
        }

        public Criteria andReservationIdEqualTo(Long value) {
            addCriterion("reservation_id =", value, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdNotEqualTo(Long value) {
            addCriterion("reservation_id <>", value, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdGreaterThan(Long value) {
            addCriterion("reservation_id >", value, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reservation_id >=", value, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdLessThan(Long value) {
            addCriterion("reservation_id <", value, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdLessThanOrEqualTo(Long value) {
            addCriterion("reservation_id <=", value, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdIn(List<Long> values) {
            addCriterion("reservation_id in", values, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdNotIn(List<Long> values) {
            addCriterion("reservation_id not in", values, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdBetween(Long value1, Long value2) {
            addCriterion("reservation_id between", value1, value2, "reservationId");
            return (Criteria) this;
        }

        public Criteria andReservationIdNotBetween(Long value1, Long value2) {
            addCriterion("reservation_id not between", value1, value2, "reservationId");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeIsNull() {
            addCriterion("illness_describe is null");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeIsNotNull() {
            addCriterion("illness_describe is not null");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeEqualTo(String value) {
            addCriterion("illness_describe =", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeNotEqualTo(String value) {
            addCriterion("illness_describe <>", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeGreaterThan(String value) {
            addCriterion("illness_describe >", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("illness_describe >=", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeLessThan(String value) {
            addCriterion("illness_describe <", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeLessThanOrEqualTo(String value) {
            addCriterion("illness_describe <=", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeLike(String value) {
            addCriterion("illness_describe like", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeNotLike(String value) {
            addCriterion("illness_describe not like", value, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeIn(List<String> values) {
            addCriterion("illness_describe in", values, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeNotIn(List<String> values) {
            addCriterion("illness_describe not in", values, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeBetween(String value1, String value2) {
            addCriterion("illness_describe between", value1, value2, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeNotBetween(String value1, String value2) {
            addCriterion("illness_describe not between", value1, value2, "illnessDescribe");
            return (Criteria) this;
        }

        public Criteria andDealStateIsNull() {
            addCriterion("deal_state is null");
            return (Criteria) this;
        }

        public Criteria andDealStateIsNotNull() {
            addCriterion("deal_state is not null");
            return (Criteria) this;
        }

        public Criteria andDealStateEqualTo(Integer value) {
            addCriterion("deal_state =", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotEqualTo(Integer value) {
            addCriterion("deal_state <>", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateGreaterThan(Integer value) {
            addCriterion("deal_state >", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_state >=", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateLessThan(Integer value) {
            addCriterion("deal_state <", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateLessThanOrEqualTo(Integer value) {
            addCriterion("deal_state <=", value, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateIn(List<Integer> values) {
            addCriterion("deal_state in", values, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotIn(List<Integer> values) {
            addCriterion("deal_state not in", values, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateBetween(Integer value1, Integer value2) {
            addCriterion("deal_state between", value1, value2, "dealState");
            return (Criteria) this;
        }

        public Criteria andDealStateNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_state not between", value1, value2, "dealState");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdIsNull() {
            addCriterion("old_visit_id is null");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdIsNotNull() {
            addCriterion("old_visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdEqualTo(Long value) {
            addCriterion("old_visit_id =", value, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdNotEqualTo(Long value) {
            addCriterion("old_visit_id <>", value, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdGreaterThan(Long value) {
            addCriterion("old_visit_id >", value, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("old_visit_id >=", value, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdLessThan(Long value) {
            addCriterion("old_visit_id <", value, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdLessThanOrEqualTo(Long value) {
            addCriterion("old_visit_id <=", value, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdIn(List<Long> values) {
            addCriterion("old_visit_id in", values, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdNotIn(List<Long> values) {
            addCriterion("old_visit_id not in", values, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdBetween(Long value1, Long value2) {
            addCriterion("old_visit_id between", value1, value2, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andOldVisitIdNotBetween(Long value1, Long value2) {
            addCriterion("old_visit_id not between", value1, value2, "oldVisitId");
            return (Criteria) this;
        }

        public Criteria andMzCodeLikeInsensitive(String value) {
            addCriterion("upper(mz_code) like", value.toUpperCase(), "mzCode");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLikeInsensitive(String value) {
            addCriterion("upper(visit_time) like", value.toUpperCase(), "visitTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLikeInsensitive(String value) {
            addCriterion("upper(start_time) like", value.toUpperCase(), "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLikeInsensitive(String value) {
            addCriterion("upper(end_time) like", value.toUpperCase(), "endTime");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLikeInsensitive(String value) {
            addCriterion("upper(VISIT_DEPT) like", value.toUpperCase(), "visitDept");
            return (Criteria) this;
        }

        public Criteria andAgeLikeInsensitive(String value) {
            addCriterion("upper(AGE) like", value.toUpperCase(), "age");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(create_time) like", value.toUpperCase(), "createTime");
            return (Criteria) this;
        }

        public Criteria andRStartTimeLikeInsensitive(String value) {
            addCriterion("upper(r_start_time) like", value.toUpperCase(), "rStartTime");
            return (Criteria) this;
        }

        public Criteria andREndTimeLikeInsensitive(String value) {
            addCriterion("upper(r_end_time) like", value.toUpperCase(), "rEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLikeInsensitive(String value) {
            addCriterion("upper(task_time) like", value.toUpperCase(), "taskTime");
            return (Criteria) this;
        }

        public Criteria andIllnessDescribeLikeInsensitive(String value) {
            addCriterion("upper(illness_describe) like", value.toUpperCase(), "illnessDescribe");
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