package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.domain.DtTeam;
import com.huatuo.customer.domain.DtTeamPojo;


public interface DtTeamMapper {
    int deleteByPrimaryKey(String dtTeamId);

    int insert(DtTeam record);

    int insertSelective(DtTeam record);

    DtTeam selectByPrimaryKey(String dtTeamId);

    int updateByPrimaryKeySelective(DtTeam record);

    int updateByPrimaryKey(DtTeam record);
    
    /**
     * 查询某个地区的医生团队信息
     * @param map
     * @return
     */
    List<DtTeam> selectByaddressId(Map<String,Object> map);
    /**
     * 查询某个地区的医生团队信息数量
     * @param map
     * @return
     */   
    int countByAddressId(Map<String,Object> map);
    
    /**
     * 查询团队总数
     * @param map
     * @return
     */
	int countDtTeams(Map<String, Object> map);

	/**
	 * 查询团队信息集合
	 * @param map
	 * @return
	 */
	List<DtTeamPojo> listDtTeams(Map<String, Object> map);

	/**
	 * 查询我的医生团队
	 * @param map
	 * @return
	 */
	List<DtTeamPojo> getMyDoctorTeam(Map<String, Object> map);

	/**
	 * 用户的家庭医生个数
	 * @param map
	 * @return
	 */
	int hasDoctorTeam(Map<String, Object> map);

}