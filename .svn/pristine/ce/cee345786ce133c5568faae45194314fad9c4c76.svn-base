package com.huatuo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.query.AddressQuery;
import com.huatuo.customer.response.AddressResponse;
import com.huatuo.customer.service.AddressService;
import com.huatuo.customer.service.LoginService;
import com.huatuo.customer.service.PersonService;
import com.huatuo.register.domain.response.LoginDataResponse;

@RestController
@RequestMapping(value = "address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * 根据等级查询区域
	 * @return
	 */
	@PostMapping(value = "selectXtZdDistrictByGrade")
	public AddressResponse selectXtZdDistrictByGrade(
			@RequestBody AddressQuery addressQuery) throws Exception{
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setLists(addressService.selectXtZdDistrictByGrade(addressQuery));
		addressResponse.setCode(BaseResponse.SUCCESS_CODE);
		addressResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return addressResponse;
	}
	
	/**
	 * 获取登录用户地址信息
	 */
	@GetMapping(value = "selectAddressByToken")
	public AddressResponse selectAddressByUserId(@RequestParam(value="token") String token)throws Exception{
		AddressResponse addressResponse = new AddressResponse();
		LoginDataResponse loginDataResponse = loginService.getUserInfoByLogin(token);
		if(loginDataResponse!=null){//登陆用户不为空 
			String userId =	loginDataResponse.getXtUser().getUserId();
			XtPerson person = personService.getPersonByUserId(userId);			
			XtAddress address =addressService.getAddressInfo(person.getAddressId());
			if(address!=null){   
				addressResponse.setAddress(address);
				addressResponse.setCode(BaseResponse.SUCCESS_CODE);
				addressResponse.setMessage(BaseResponse.SUCCESS_MESSAGE); 
			}		
		}		
        return addressResponse;
	}

	/**
	 * 根据等级或者父子级查询区域信息统一接口
	 * @return
	 */
	@PostMapping(value = "selectDistrictByGradeOrParentId")
	public AddressResponse selectDistrictByGradeOrParentId(
			@RequestBody AddressQuery addressQuery) throws Exception{
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setLists(addressService.selectDistrictByGradeOrParentId(addressQuery));
		addressResponse.setCode(BaseResponse.SUCCESS_CODE);
		addressResponse.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return addressResponse;
	}
	
}
