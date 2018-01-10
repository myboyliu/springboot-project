package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.base.domain.XtEvidence;

public interface XtEvidenceMapper {
    int insert(XtEvidence record);

    int insertSelective(XtEvidence record);
    
	XtEvidence select(XtEvidence xtEvidence);

	void save(XtEvidence xtEvidence);

	@SuppressWarnings("rawtypes")
	List<Map> selectNeedPay(Map<String, String> map);

	void updateState(Map<String, String> map);
}