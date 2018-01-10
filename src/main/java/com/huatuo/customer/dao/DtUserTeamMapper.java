package com.huatuo.customer.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatuo.customer.domain.DtUserTeam;

public interface DtUserTeamMapper {
    int deleteByPrimaryKey(String userTeamId);

    int insert(DtUserTeam record);

    int insertSelective(DtUserTeam record);

    DtUserTeam selectByPrimaryKey(String userTeamId);

    int updateByPrimaryKeySelective(DtUserTeam record);

    int updateByPrimaryKey(DtUserTeam record);
    
    
    
    /**
     * 保存用户和家医团队的签约信息
     * @param userTeam
     * @return 
     */
	int saveDtUserTeam(DtUserTeam userTeam);

	/**
	 * 查询医生团队和用户的中间表关系
	 * @param map
	 * @return
	 */
	DtUserTeam getDtUserTean(Map<String, Object> map);

	/**
	 * 修改用户和家医团队中间表状态
	 * @param userId		用户id
	 * @param dtTeamId		团队id
	 * @param nowTime		当前时间	
	 * @param delFlag 		是否过期: 0.否, 1.是
	 * @return
	 */
	int updateToDelflag(@Param("userId") String userId, 
						@Param("dtTeamId") String dtTeamId,
						@Param("nowTime") String nowTime, 
						@Param("delFlag") Integer delFlag);
}