package com.huatuo.customer.service;

import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.request.PersonParam;
import com.huatuo.customer.request.VisitForm;

/**
 * 个人业务
 * @author master
 *
 */
public interface PersonService {
	
	/**
	 * 更新个人信息
	 * @param visitForm
	 * @return
	 */
	public Integer updatePerson(VisitForm visitForm);

	/**
	 * 根据userId获取个人信息
	 * @param userId
	 * @return
	 */
	public XtPerson getPersonByUserId(String userId);
	
	/**
	 * 根据用户id查询个人信息
	 * @param userId
	 * @return
	 */
	public XtPerson selectPersonByUserId(Long userId);
	
	/**
	 * 登录时查询个人信息
	 * @param personId
	 * @return
	 */
	public com.huatuo.register.domain.XtPerson selectByUserIdForLogin(Long userId);
	
	/**
	 * 更新保存个人信息
	 * @param personParam
	 * @return
	 */
	public Integer savePersonInfo(PersonParam personParam);
}
