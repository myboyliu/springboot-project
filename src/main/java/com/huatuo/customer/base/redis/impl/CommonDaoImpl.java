package com.huatuo.customer.base.redis.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.huatuo.customer.base.redis.CommonDao;
import com.huatuo.customer.base.redis.RedisSupport;
import com.huatuo.customer.base.util.ConfigProperites;
import com.huatuo.customer.domain.UserPTIdPojo;
import com.huatuo.db.pojo.FlexVisitQueuePojo;
import com.huatuo.db.redis.pojo.DoctorTypePojo;




@Repository
public class CommonDaoImpl extends RedisSupport implements CommonDao{
	/**
	 * redis保存时间为1天,1天后自动销毁
	 */
	private static final long TIMES = 1*86400;
	
	
	private final static String DOCTORID = ConfigProperites.getDoctorid();	
	
	private final static String REDIS_KEY_QUEUING_MAP = ConfigProperites.getRedisKeyQueuingMap();
	
	@Override
	public List<FlexVisitQueuePojo> getFlexVisitQueuePojo() {
		List<Object> list = this.hGet(REDIS_KEY_QUEUING_MAP);
		List<FlexVisitQueuePojo> listBack = new ArrayList<>();
		if(list != null){
			for (Object object : list) {
				FlexVisitQueuePojo queuePojo = (FlexVisitQueuePojo) object;
				listBack.add(queuePojo);
			}
		}
		return listBack;
	}
	
	@Override
	public DoctorTypePojo getDoctorTypePojo(Long doctorId) {
		Serializable serializable = this.get(DOCTORID + doctorId);
		String str = JSON.toJSONString(serializable);
		DoctorTypePojo pojo = JSON.parseObject(str, DoctorTypePojo.class);
		return pojo;
	}
	
	
	@Override
	public FlexVisitQueuePojo getFlexVisitQueuePojo(long doctorId) {
		return (FlexVisitQueuePojo) this.hGet(REDIS_KEY_QUEUING_MAP, Long.toString(doctorId));
		/*Serializable serializable = (Serializable)this.hGet(REDIS_KEY_QUEUING_MAP, Long.toString(doctorId));
		String str = JSON.toJSONString(serializable);
		FlexVisitQueuePojo pojo = JSON.parseObject(str, FlexVisitQueuePojo.class);
	    return pojo;*/
	}

	@Override
	public void setDoctorTypePojo(Long doctorId, DoctorTypePojo doctorType) {
		this.set(DOCTORID + doctorId, doctorType, TIMES);
	}

	@Override
	public void setUserPTIdPojo(String orderNo, UserPTIdPojo userPTIdPojo) {
		this.set(UserPTIdPojo.class.getName() + orderNo, userPTIdPojo, TIMES);
	}

	@Override
	public UserPTIdPojo getUserPTIdPojo(String orderNo) {
		Serializable serializable = this.get(UserPTIdPojo.class.getName() + orderNo);
		String str = JSON.toJSONString(serializable);
		UserPTIdPojo pojo = JSON.parseObject(str, UserPTIdPojo.class);
		return pojo;
	}

	@Override
	public void deleteUserPTIdPojo(String orderNo) {
		this.delete(UserPTIdPojo.class.getName() + orderNo);
	}

}
