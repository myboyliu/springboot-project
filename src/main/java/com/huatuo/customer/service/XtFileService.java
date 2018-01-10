package com.huatuo.customer.service;

import com.huatuo.customer.domain.XtFile;


/**
 * 文件上传
 * @author master
 *
 */
public interface XtFileService{
	
	/**
	 * 保存文件上传信息
	 * @param xtfile
	 * @return
	 */
	Long insertFile(XtFile xtfile);
	
	
	
}
