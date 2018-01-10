package com.huatuo.customer.service;

import java.text.ParseException;
import java.util.List;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.domain.MzVisit;
import com.huatuo.customer.query.VisitQuery;
import com.huatuo.customer.request.VisitForm;

public interface MzVisitService {
	/**
	 * 保存一条业务订单
	 * @param visitForm
	 * @return
	 * @throws ParseException 
	 * @throws Exception 
	 */
	public MzVisit saveVisitByVisitForm(VisitForm visitForm) throws ParseException, Exception;
	/**
	 * 查询一条业务订单
	 * @return
	 */
	public MzVisit selectVisitById(Long visitId);
	
	/**
	 * 修改业务订单
	 * @return
	 */
	Integer updateMzVisit(MzVisit mzVisit);
	/**
	 * 拿取患者下的所有订单业务
	 * @param query
	 * @return
	 */
	public Page<MzVisit> getServiceRecordByPatient(VisitQuery query);
	
	/**
	 * 查询当天预约订单的数目
	 * @param nowDate
	 * @return
	 */
	public List<MzVisit> selectReservationVisitCountForTay(String nowDate, String userId);
	
	/**
	 * 特殊处理有提取码的处方，
	 * 如果没有处方但是有提取码，
	 * 则把提取码清空
	 * @param visitId
	 */
	public void handleMzVisitForExtractedCode(String visitId);
	
	/**
	 * 检测是否有当前选择的患者未支付的普通订单
	 * @return
	 */
	public MzVisit checkIsHaveNotPayingOrder(VisitForm visitForm);
	
	/**
	 * 检测当前提交的患者是否有
	 * 待服务或者服务中的未完成的普通订单
	 * @param visitForm
	 * @return
	 */
	public MzVisit checkOrderIsTakePartInVisit(VisitForm visitForm);
}
