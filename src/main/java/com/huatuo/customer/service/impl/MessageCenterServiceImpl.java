package com.huatuo.customer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtMessageCenterMapper;
import com.huatuo.customer.domain.XtMessageCenter;
import com.huatuo.customer.service.MessageCenterService;
@Service(value="messageCenterService")
public class MessageCenterServiceImpl implements MessageCenterService{
	@Resource
	private XtMessageCenterMapper xtMessageCenterMapper;
	@Override
	public int insert(XtMessageCenter record) {
		return xtMessageCenterMapper.insert(record);
	}
	@Override
	public List<XtMessageCenter> select(XtMessageCenter xtMessageCenter) {
		return xtMessageCenterMapper.select(xtMessageCenter);
	}
	@Override
	public int updateByPrimaryKey(XtMessageCenter xtMessageCenter) {
		return xtMessageCenterMapper.updateByPrimaryKey(xtMessageCenter);
	}

}
