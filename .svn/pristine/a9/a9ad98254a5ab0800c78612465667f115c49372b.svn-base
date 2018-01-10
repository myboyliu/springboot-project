package com.huatuo.customer.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtZdPregnantCheckProjectMapper;
import com.huatuo.customer.domain.XtZdPregnantCheckProject;
import com.huatuo.customer.service.PregnantCheckProjectService;

@Service
@Transactional
public class PregnantCheckProjectServiceImpl implements PregnantCheckProjectService{

	@Autowired
	private XtZdPregnantCheckProjectMapper xtZdPregnantCheckProjectMapper;
	
	@Override
	public List<XtZdPregnantCheckProject> selectPregnantCheckProjects() {
		return xtZdPregnantCheckProjectMapper.selectPregnantCheckProjects();
	}

}
