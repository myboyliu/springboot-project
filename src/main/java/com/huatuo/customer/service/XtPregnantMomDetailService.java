package com.huatuo.customer.service;

import com.huatuo.customer.query.PregnantMomQuery;
import com.huatuo.customer.request.PregnantMomParam;
import com.huatuo.customer.response.PregnantMomResponse;

/**
 * 孕妈记录详情业务层
 * @author Administrator
 *
 */
public interface XtPregnantMomDetailService {
	/**
	 * 添加一条孕妈记录详情
	 * @param xtPregnantMomDetail
	 * @return
	 * @throws Exception 
	 */
	Integer insertPregnantMomDetail(PregnantMomParam pregnantMomParam) throws Exception;
	
	/**
	 * 查询孕期心情记录
	 * @param pregnantMomQuery
	 * @return
	 * @throws Exception 
	 */
	PregnantMomResponse selectregnantMomDetailsByUserId(PregnantMomQuery pregnantMomQuery) throws Exception;
	
}
