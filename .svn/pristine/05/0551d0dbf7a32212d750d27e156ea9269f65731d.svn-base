package com.huatuo.customer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.request.PersonParam;
import com.huatuo.customer.response.PersonResponse;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.LoginService;
import com.huatuo.customer.service.PersonFamilyService;
import com.huatuo.customer.service.PersonService;
import com.huatuo.customer.service.XtFeedBackService;
import com.huatuo.customer.service.XtZdOccupationService;
import com.huatuo.register.domain.response.LoginDataResponse;

/**
 * 个人操作
 * @author master
 *
 */
@RestController
@RequestMapping(value = "person")
public class PersonController {
	
	@Autowired
	private PersonFamilyService personFamilyService;
	
	@Autowired
	private XtZdOccupationService xtZdOccupationService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private XtFeedBackService xtFeedBackService;
	
	@Autowired
	private AddressService addressService;
	
//	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	/**
	 * 获取个人基本信息
	 * @return
	 */
	@GetMapping(value = "obtainPersonInfomation")
	public Object obtainPersonInfomation(HttpServletRequest request){
		PersonResponse personResponse = new PersonResponse();
		personResponse.setXtPerson(Utils.getLoginUserInfo(request).getXtPerson());
		return personResponse;
	}
	
	/**
	 * 通过id查询用户信息及家庭成员信息
	 * 
    **/
	@GetMapping(value = "personInfo")
	public Object getPersonInfo(HttpServletRequest request)throws Exception{
		PersonResponse personResponse = new PersonResponse();
		LoginDataResponse loginDataResponse = Utils.getLoginUserInfo(request);
		com.huatuo.register.domain.XtPerson xtPerson = loginDataResponse.getXtPerson();
		personResponse.setXtPerson(xtPerson);
		personResponse.setXtAddress(loginDataResponse.getXtAddress());
		List<XtPersonFamily> list = personFamilyService.selectFamilyListByUserId(Long.parseLong(xtPerson.getUserId()));
		for (XtPersonFamily xtPersonFamily : list) {
			xtPersonFamily.setXtAddress(addressService.selectAddressById(xtPersonFamily.getAddressId()));
		}
		personResponse.setFamilyList(list);
		personResponse.setCode(BaseResponse.SUCCESS_CODE);
		personResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);				
 		return personResponse;
	}
	
	/**
	 * 个人信息编辑页面信息展示
	 */
	@GetMapping(value="showPersonInfo")
	public Object showPersonInfo(HttpServletRequest request)throws Exception{
		PersonResponse personResponse = new PersonResponse();
		LoginDataResponse loginDataResponse = Utils.getLoginUserInfo(request);
		personResponse.setXtPerson(loginDataResponse.getXtPerson());
		personResponse.setXtAddress(loginDataResponse.getXtAddress());
		personResponse.setOccupations(xtZdOccupationService.getOccupationList());
		personResponse.setCode(BaseResponse.SUCCESS_CODE);
		personResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return personResponse;
	}
	
	/**
	 * 更新个人信息
	 * @param personParam
	 * @param request
	 * @return
	 */
	@PostMapping(value = "savePersonInfo")
	public Object savePersonInfo(
			@RequestBody PersonParam personParam,
			HttpServletRequest request){
		PersonResponse personResponse = new PersonResponse();
		personParam.setUserId(Long.parseLong(Utils.getUserIdByToken(request)));
		personService.savePersonInfo(personParam);
		personResponse.setCode(BaseResponse.SUCCESS_CODE);
		personResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		loginService.updateUserInfo(Utils.getToken(request));
		return personResponse;
	}
	
	/**
	 * 个人中心意见反馈提交
	 * @throws Exception 
	 */
	@PostMapping(value = "saveFeedback")
	public Object saveFeedback(@RequestBody PersonParam personParam,
		HttpServletRequest request) throws Exception{
		PersonResponse personResponse = new PersonResponse();
		personParam.setUserId(Long.parseLong(Utils.getUserIdByToken(request)));
		xtFeedBackService.insertUserFeedBack(personParam);
		personResponse.setCode(BaseResponse.SUCCESS_CODE);
		personResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return personResponse;
	}
}