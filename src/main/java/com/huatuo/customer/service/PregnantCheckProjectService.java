package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.domain.XtZdPregnantCheckProject;

/**
 * 孕期检查项目字典业务
 * @author Administrator
 *
 */
public interface PregnantCheckProjectService {
	
	/**
	 * 查询所有的孕期检查项目
	 * @return
	 */
	List<XtZdPregnantCheckProject> selectPregnantCheckProjects();
	
}
