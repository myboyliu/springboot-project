package com.huatuo.customer.service;

import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.domain.XtEvaluate;
import com.huatuo.customer.query.EvaluateQuery;

/**
 * 评价业务类
 * @author Dell
 *
 */
public interface EvaluateService {
	
	/**
	 * 添加评价
	 * @param evaluate
	 * @return
	 */
	public Integer addEvaluate(XtEvaluate evaluate);
	
	/**
	 *	分页查找评价
	 * @param evaluateQuery
	 * @return
	 */
	public Page<XtEvaluate> selectEvaluatesByPage(EvaluateQuery evaluateQuery);
}
