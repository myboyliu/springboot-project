package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.XtEvaluate;
import com.huatuo.customer.query.EvaluateQuery;

public interface XtEvaluateMapper {
    int deleteByPrimaryKey(String evaluateId);

    int insert(XtEvaluate record);

    int insertSelective(XtEvaluate record);

    XtEvaluate selectByPrimaryKey(String evaluateId);

    int updateByPrimaryKeySelective(XtEvaluate record);

    int updateByPrimaryKey(XtEvaluate record);
    
    /**
	 * 查询评价列表
	 * @param evaluateQuery
	 * @return
	 */
	public List<XtEvaluate> seachEvaluateList(EvaluateQuery evaluateQuery);
	
	/**
	 * 查询评价数量
	 * @param evaluateQuery
	 * @return
	 */
	public Integer seachEvaluateCount(EvaluateQuery evaluateQuery);
}