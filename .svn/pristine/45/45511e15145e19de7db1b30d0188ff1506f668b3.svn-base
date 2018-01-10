package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huatuo.customer.domain.DtUserPackageRecord;

public interface DtUserPackageRecordMapper {
    int deleteByPrimaryKey(String userPackageRecordId);

    int insert(DtUserPackageRecord record);

    int insertSelective(DtUserPackageRecord record);

    DtUserPackageRecord selectByPrimaryKey(String userPackageRecordId);

    int updateByPrimaryKeySelective(DtUserPackageRecord record);

    int updateByPrimaryKey(DtUserPackageRecord record);

    
    //自定义    
    /**
     * 家庭医生业务（视频剩余次数判断）
     * @param map
     * @return
     */
	int residueDegree(Map<String, Object> map);

	/**
	 * 保存
	 * @param record
	 * @return
	 */
	int saveDtUserPackageRecord(DtUserPackageRecord record);

	/**
	 * 修改用户和套餐详情中间表状态
	 * @param userId		用户id
	 * @param dtTeamId		团队id
	 * @param teamPackageId	套餐id
	 * @param nowTime		当前时间
	 * @param state			服务状态:0 服务中 1已结束
	 * @return
	 */
	int updateToDelflag(@Param("userId") String userId, 
						@Param("dtTeamId") String dtTeamId,
						@Param("teamPackageId") String teamPackageId, 
						@Param("nowTime") String nowTime, 
						@Param("state") Integer state);

	/**
	 * 查询用户签约套餐记录
	 * @param userId		用户id
	 * @param dtTeamId		团队id
	 * @param serviceType	子项套餐服务类型
	 * @return
	 */
	List<DtUserPackageRecord> listDtUPRecord(@Param("userId") String userId, 
											 @Param("dtTeamId") String dtTeamId,
											 @Param("serviceType") Integer serviceType);

	/**
	 * 修改用户签约套餐记录次数(每次减1)
	 * @param userPackageRecordId	用户签约套餐记录
	 * @return
	 */
	int updateResidueDegree(@Param("userPackageRecordId") String userPackageRecordId);
}