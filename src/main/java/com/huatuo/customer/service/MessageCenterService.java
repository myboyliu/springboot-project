package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.domain.XtMessageCenter;

public interface MessageCenterService {
	int insert(XtMessageCenter record);

	List<XtMessageCenter> select(XtMessageCenter xtMessageCenter);

	int updateByPrimaryKey(XtMessageCenter xtMessageCenter);
}
