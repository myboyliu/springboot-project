package com.huatuo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtPersonFamily;
import com.huatuo.customer.request.PersonParam;
import com.huatuo.customer.response.PersonFamilyResponse;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.PersonFamilyService;
import com.huatuo.customer.service.XtZdFamilyRelationService;
import com.huatuo.customer.service.XtZdOccupationService;

@RequestMapping(value = "personFamily")
@RestController
public class PersonFamilyController {
	
	@Autowired
	private PersonFamilyService personFamilyService;

	@Autowired
	private XtZdOccupationService xtZdOccupationService;
	
	@Autowired
	private XtZdFamilyRelationService xtZdFamilyRelationService;	
	
	@Autowired
	private AddressService addressService;
	
	/**
	 * 到新增页面
	 */
	@GetMapping(value="toAddPersonFamily")
	public Object toAddPersonFamily()throws Exception{
		PersonFamilyResponse personFamilyResponse = new PersonFamilyResponse();
		/**
		 * 初始化家庭成员关系列表
		 */
		personFamilyResponse.setFamilyRelationList(xtZdFamilyRelationService.getFamilyRelationList());
		personFamilyResponse.setCode(BaseResponse.SUCCESS_CODE);
		personFamilyResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);		
		return personFamilyResponse;
	}
	
	/**
	 * 增加家庭成员信息
	 */
	@PostMapping(value="addPersonFamily")
	public Object addPersonFamily(@RequestBody PersonParam personParam)throws Exception{
		PersonFamilyResponse personFamilyResponse = new PersonFamilyResponse();	
		personFamilyResponse.setPersonFamilyId(personFamilyService.insertFamily(personParam));	
		personFamilyResponse.setCode(BaseResponse.SUCCESS_CODE);
		personFamilyResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return personFamilyResponse;
	}	
	
	/**
	 * 到某个家庭成员编辑页面
	 */
	@GetMapping(value="toEditPersonFamily")
	public Object toPersonFamily(@RequestParam("personFamilyId") Long personFamilyId)throws Exception{		
		PersonFamilyResponse personFamilyResponse = new PersonFamilyResponse();
		XtPersonFamily xtPersonFamily=personFamilyService.selectOneFamilyById(personFamilyId);			
		personFamilyResponse.setXtPersonFamily(xtPersonFamily);
	    personFamilyResponse.setFamilyRelationList(xtZdFamilyRelationService.getFamilyRelationList());
		personFamilyResponse.setOccupationList(xtZdOccupationService.getOccupationList());
		personFamilyResponse.setXtAddress(addressService.selectAddressById(xtPersonFamily.getAddressId()));
		personFamilyResponse.setCode(BaseResponse.SUCCESS_CODE);
		personFamilyResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);  				
		return personFamilyResponse;		
	}	
	
	/**
	 * 保存家庭成员信息
	 */
	@PostMapping(value="savePersonFamily")
	public Object savePersonFamilyEdit(@RequestBody PersonParam personParam)throws Exception{
		PersonFamilyResponse personFamilyResponse = new PersonFamilyResponse();
	    personFamilyService.updatePersonFamilyModel(personParam);
		personFamilyResponse.setCode(BaseResponse.SUCCESS_CODE);
		personFamilyResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return personFamilyResponse;
	}	
	
	/**
	 * 删除家庭成员
	 */
	@GetMapping(value="deletePersonFamilyById")
	public Object deletePersonFamilyById(@RequestParam("personFamilyId") Long personFamilyId)throws Exception{		
		PersonFamilyResponse personFamilyResponse = new PersonFamilyResponse();
		int record=personFamilyService.deletePersonFamily(personFamilyId);
		if(record==1){
			personFamilyResponse.setCode(BaseResponse.SUCCESS_CODE);
			personFamilyResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);  				
		}else{
			personFamilyResponse.setCode(BaseResponse.ERROR_CODE);
			personFamilyResponse.setMessage(BaseResponse.ERROR_MESSAGE);			
		}				
		return personFamilyResponse;		
	}
}
