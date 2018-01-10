package com.huatuo.customer.service;

import com.huatuo.customer.domain.DtUserPackageRecord;


/**
 * 操作用户签约套餐记录表
 * @author Administrator
 *
 */
public interface DtUserPackageRecordService {

	/**
	 * 家庭医生业务（视频剩余次数判断）
	 * @param userId		用户id	
	 * @param dtTeamId		团队id
	 * @param serviceType	子项套餐服务类型
	 * @return
	 */
	int residueDegree(String userId, String dtTeamId, Integer serviceType);
	
	/**
	 * 查询用户签约套餐记录
	 * @param userId		用户id
	 * @param dtTeamId		团队id
	 * @param serviceType	子项套餐服务类型
	 * @return
	 */
	DtUserPackageRecord getDtUPRecord(String userId, String dtTeamId, Integer serviceType);

	/**
	 * 修改用户签约套餐记录次数(每次减1)
	 * @param userPackageRecordId	用户签约套餐记录id
	 * @return
	 */
	int updateResidueDegree(String userPackageRecordId);
	
}
