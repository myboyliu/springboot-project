package com.huatuo.customer.base.redis;

import java.util.List;


import com.huatuo.customer.domain.UserPTIdPojo;
import com.huatuo.db.pojo.FlexVisitQueuePojo;
import com.huatuo.db.redis.pojo.DoctorTypePojo;



public interface CommonDao {
	/**
	 * 设置值
	 */
	public void setDoctorTypePojo(Long doctorId, DoctorTypePojo doctorType);
	
	
	
	/**
	 * 获取医生的队列集合
	 * @return
	 */
	List<FlexVisitQueuePojo> getFlexVisitQueuePojo();
	
	
	/**
	 * 查询预约信息
	 * @param doctorId
	 * @return
	 */
	DoctorTypePojo getDoctorTypePojo(Long doctorId);
	
	FlexVisitQueuePojo getFlexVisitQueuePojo(long doctorId);


	/**
	 * 临时存取用户和家医团队以及套餐包的id和购买时间
	 * @param orderNo		订单号
	 * @param userPTIdPojo	用户和家医团队以及套餐包的id
	 */
	public void setUserPTIdPojo(String orderNo, UserPTIdPojo userPTIdPojo);
	
	/**
	 * 获取用户和家医团队以及套餐包的id和购买时间
	 * @param orderNo		订单号
	 * @return
	 */
	public UserPTIdPojo getUserPTIdPojo(String orderNo);
	
	/**
	 * 清除
	 * @param orderNo
	 */
	public void deleteUserPTIdPojo(String orderNo);
}
