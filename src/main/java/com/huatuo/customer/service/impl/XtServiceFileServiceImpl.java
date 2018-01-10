package com.huatuo.customer.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtServiceFileMapper;
import com.huatuo.customer.domain.XtServiceFile;
import com.huatuo.customer.service.XtServiceFileService;

@Service
@Transactional
public class  XtServiceFileServiceImpl implements XtServiceFileService{

	@Autowired
	private XtServiceFileMapper xtServiceFileMapper;

	@Override
	public int insertXtServiceFile(XtServiceFile xtSerFile) {
		return xtServiceFileMapper.insert(xtSerFile);
	}


}
