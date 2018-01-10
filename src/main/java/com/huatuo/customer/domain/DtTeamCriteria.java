package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class DtTeamCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtTeamCriteria() {
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

        public Criteria andDtTeamIdIsNull() {
            addCriterion("dt_team_id is null");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdIsNotNull() {
            addCriterion("dt_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdEqualTo(String value) {
            addCriterion("dt_team_id =", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotEqualTo(String value) {
            addCriterion("dt_team_id <>", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdGreaterThan(String value) {
            addCriterion("dt_team_id >", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("dt_team_id >=", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLessThan(String value) {
            addCriterion("dt_team_id <", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLessThanOrEqualTo(String value) {
            addCriterion("dt_team_id <=", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLike(String value) {
            addCriterion("dt_team_id like", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotLike(String value) {
            addCriterion("dt_team_id not like", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdIn(List<String> values) {
            addCriterion("dt_team_id in", values, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotIn(List<String> values) {
            addCriterion("dt_team_id not in", values, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdBetween(String value1, String value2) {
            addCriterion("dt_team_id between", value1, value2, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotBetween(String value1, String value2) {
            addCriterion("dt_team_id not between", value1, value2, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andOwnMemberIsNull() {
            addCriterion("own_member is null");
            return (Criteria) this;
        }

        public Criteria andOwnMemberIsNotNull() {
            addCriterion("own_member is not null");
            return (Criteria) this;
        }

        public Criteria andOwnMemberEqualTo(Integer value) {
            addCriterion("own_member =", value, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberNotEqualTo(Integer value) {
            addCriterion("own_member <>", value, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberGreaterThan(Integer value) {
            addCriterion("own_member >", value, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("own_member >=", value, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberLessThan(Integer value) {
            addCriterion("own_member <", value, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberLessThanOrEqualTo(Integer value) {
            addCriterion("own_member <=", value, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberIn(List<Integer> values) {
            addCriterion("own_member in", values, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberNotIn(List<Integer> values) {
            addCriterion("own_member not in", values, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberBetween(Integer value1, Integer value2) {
            addCriterion("own_member between", value1, value2, "ownMember");
            return (Criteria) this;
        }

        public Criteria andOwnMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("own_member not between", value1, value2, "ownMember");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdIsNull() {
            addCriterion("admin_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdIsNotNull() {
            addCriterion("admin_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdEqualTo(String value) {
            addCriterion("admin_doctor_id =", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdNotEqualTo(String value) {
            addCriterion("admin_doctor_id <>", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdGreaterThan(String value) {
            addCriterion("admin_doctor_id >", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_doctor_id >=", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdLessThan(String value) {
            addCriterion("admin_doctor_id <", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("admin_doctor_id <=", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdLike(String value) {
            addCriterion("admin_doctor_id like", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdNotLike(String value) {
            addCriterion("admin_doctor_id not like", value, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdIn(List<String> values) {
            addCriterion("admin_doctor_id in", values, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdNotIn(List<String> values) {
            addCriterion("admin_doctor_id not in", values, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdBetween(String value1, String value2) {
            addCriterion("admin_doctor_id between", value1, value2, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdNotBetween(String value1, String value2) {
            addCriterion("admin_doctor_id not between", value1, value2, "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexIsNull() {
            addCriterion("recommended_index is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexIsNotNull() {
            addCriterion("recommended_index is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexEqualTo(Integer value) {
            addCriterion("recommended_index =", value, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexNotEqualTo(Integer value) {
            addCriterion("recommended_index <>", value, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexGreaterThan(Integer value) {
            addCriterion("recommended_index >", value, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommended_index >=", value, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexLessThan(Integer value) {
            addCriterion("recommended_index <", value, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexLessThanOrEqualTo(Integer value) {
            addCriterion("recommended_index <=", value, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexIn(List<Integer> values) {
            addCriterion("recommended_index in", values, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexNotIn(List<Integer> values) {
            addCriterion("recommended_index not in", values, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexBetween(Integer value1, Integer value2) {
            addCriterion("recommended_index between", value1, value2, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andRecommendedIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("recommended_index not between", value1, value2, "recommendedIndex");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberIsNull() {
            addCriterion("already_signed_number is null");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberIsNotNull() {
            addCriterion("already_signed_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberEqualTo(Integer value) {
            addCriterion("already_signed_number =", value, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberNotEqualTo(Integer value) {
            addCriterion("already_signed_number <>", value, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberGreaterThan(Integer value) {
            addCriterion("already_signed_number >", value, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("already_signed_number >=", value, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberLessThan(Integer value) {
            addCriterion("already_signed_number <", value, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("already_signed_number <=", value, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberIn(List<Integer> values) {
            addCriterion("already_signed_number in", values, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberNotIn(List<Integer> values) {
            addCriterion("already_signed_number not in", values, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberBetween(Integer value1, Integer value2) {
            addCriterion("already_signed_number between", value1, value2, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadySignedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("already_signed_number not between", value1, value2, "alreadySignedNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberIsNull() {
            addCriterion("already_serve_number is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberIsNotNull() {
            addCriterion("already_serve_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberEqualTo(Integer value) {
            addCriterion("already_serve_number =", value, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberNotEqualTo(Integer value) {
            addCriterion("already_serve_number <>", value, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberGreaterThan(Integer value) {
            addCriterion("already_serve_number >", value, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("already_serve_number >=", value, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberLessThan(Integer value) {
            addCriterion("already_serve_number <", value, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("already_serve_number <=", value, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberIn(List<Integer> values) {
            addCriterion("already_serve_number in", values, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberNotIn(List<Integer> values) {
            addCriterion("already_serve_number not in", values, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberBetween(Integer value1, Integer value2) {
            addCriterion("already_serve_number between", value1, value2, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andAlreadyServeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("already_serve_number not between", value1, value2, "alreadyServeNumber");
            return (Criteria) this;
        }

        public Criteria andTeamDescIsNull() {
            addCriterion("team_desc is null");
            return (Criteria) this;
        }

        public Criteria andTeamDescIsNotNull() {
            addCriterion("team_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTeamDescEqualTo(String value) {
            addCriterion("team_desc =", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotEqualTo(String value) {
            addCriterion("team_desc <>", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescGreaterThan(String value) {
            addCriterion("team_desc >", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescGreaterThanOrEqualTo(String value) {
            addCriterion("team_desc >=", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLessThan(String value) {
            addCriterion("team_desc <", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLessThanOrEqualTo(String value) {
            addCriterion("team_desc <=", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescLike(String value) {
            addCriterion("team_desc like", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotLike(String value) {
            addCriterion("team_desc not like", value, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescIn(List<String> values) {
            addCriterion("team_desc in", values, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotIn(List<String> values) {
            addCriterion("team_desc not in", values, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescBetween(String value1, String value2) {
            addCriterion("team_desc between", value1, value2, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andTeamDescNotBetween(String value1, String value2) {
            addCriterion("team_desc not between", value1, value2, "teamDesc");
            return (Criteria) this;
        }

        public Criteria andUsesIsNull() {
            addCriterion("uses is null");
            return (Criteria) this;
        }

        public Criteria andUsesIsNotNull() {
            addCriterion("uses is not null");
            return (Criteria) this;
        }

        public Criteria andUsesEqualTo(Integer value) {
            addCriterion("uses =", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotEqualTo(Integer value) {
            addCriterion("uses <>", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThan(Integer value) {
            addCriterion("uses >", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThanOrEqualTo(Integer value) {
            addCriterion("uses >=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThan(Integer value) {
            addCriterion("uses <", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThanOrEqualTo(Integer value) {
            addCriterion("uses <=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesIn(List<Integer> values) {
            addCriterion("uses in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotIn(List<Integer> values) {
            addCriterion("uses not in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesBetween(Integer value1, Integer value2) {
            addCriterion("uses between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotBetween(Integer value1, Integer value2) {
            addCriterion("uses not between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNull() {
            addCriterion("del_flg is null");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNotNull() {
            addCriterion("del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlgEqualTo(Integer value) {
            addCriterion("del_flg =", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotEqualTo(Integer value) {
            addCriterion("del_flg <>", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThan(Integer value) {
            addCriterion("del_flg >", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flg >=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThan(Integer value) {
            addCriterion("del_flg <", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThanOrEqualTo(Integer value) {
            addCriterion("del_flg <=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgIn(List<Integer> values) {
            addCriterion("del_flg in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotIn(List<Integer> values) {
            addCriterion("del_flg not in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgBetween(Integer value1, Integer value2) {
            addCriterion("del_flg between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flg not between", value1, value2, "delFlg");
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

        public Criteria andSyncTimeIsNull() {
            addCriterion("sync_time is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(String value) {
            addCriterion("sync_time =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(String value) {
            addCriterion("sync_time <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(String value) {
            addCriterion("sync_time >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sync_time >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(String value) {
            addCriterion("sync_time <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(String value) {
            addCriterion("sync_time <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLike(String value) {
            addCriterion("sync_time like", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotLike(String value) {
            addCriterion("sync_time not like", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<String> values) {
            addCriterion("sync_time in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<String> values) {
            addCriterion("sync_time not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(String value1, String value2) {
            addCriterion("sync_time between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(String value1, String value2) {
            addCriterion("sync_time not between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLikeInsensitive(String value) {
            addCriterion("upper(dt_team_id) like", value.toUpperCase(), "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andTeamNameLikeInsensitive(String value) {
            addCriterion("upper(team_name) like", value.toUpperCase(), "teamName");
            return (Criteria) this;
        }

        public Criteria andAdminDoctorIdLikeInsensitive(String value) {
            addCriterion("upper(admin_doctor_id) like", value.toUpperCase(), "adminDoctorId");
            return (Criteria) this;
        }

        public Criteria andTeamDescLikeInsensitive(String value) {
            addCriterion("upper(team_desc) like", value.toUpperCase(), "teamDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(create_time) like", value.toUpperCase(), "createTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLikeInsensitive(String value) {
            addCriterion("upper(sync_time) like", value.toUpperCase(), "syncTime");
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