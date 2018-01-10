package com.huatuo.customer.service;

import java.text.ParseException;

import com.huatuo.customer.domain.XtPregnantMom;
import com.huatuo.customer.response.PregnantMomResponse;

/**
 * 孕妈
 * @author Administrator
 */
public interface XtPregnantMomService {

	/**
	 * 通过userId获得有效的状态的信息
	 * @param userId
	 * @return
	 */
	XtPregnantMom selectByUid(String userId);

	/**
	 * 保存记录
	 * @param pregnantMom
	 */
	int saveRecord(XtPregnantMom pregnantMom) throws ParseException;

	/**
	 * 修改记录
	 * @param pregnantMom
	 * @return
	 */
	int updateRecord(XtPregnantMom pregnantMom) throws ParseException;

	/**
	 * 查询当前登录用户用户孕妈基本
	 * @param userId
	 * @return
	 * @throws Exception 
	 */
	PregnantMomResponse selectPregnantMomIndexData(String userId) throws Exception;
	
	/**
	 * 查询当前登录用户是否已填写基本孕妈基本信息和今天是否已编辑心情
	 * @param userId
	 * @return
	 */
	PregnantMomResponse checkUserTakeNotesBasicInfoAndTodayInfo(String userId);
	
}
