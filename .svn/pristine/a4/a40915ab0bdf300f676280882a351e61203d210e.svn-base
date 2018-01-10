package com.huatuo.customer.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtFileMapper;
import com.huatuo.customer.domain.XtFile;
import com.huatuo.customer.service.XtFileService;

@Service
@Transactional
public class  XtFileServiceImpl implements XtFileService{

	@Autowired
	private XtFileMapper xtFileMapper;

	@Override
	public Long insertFile(XtFile xtfile) {
		xtFileMapper.insert(xtfile);
		return xtfile.getId();
	}

}
