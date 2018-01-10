package com.huatuo.customer.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.XtAddressMapper;
import com.huatuo.customer.dao.XtPersonMapper;
import com.huatuo.customer.dao.XtUserMapper;
import com.huatuo.customer.dao.XtZdOccupationMapper;
import com.huatuo.customer.domain.XtAddress;
import com.huatuo.customer.domain.XtPerson;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private XtUserMapper xtUserMapper;
	
	@Autowired 
	XtPersonMapper xtPersonMapper;
	
	@Autowired 
	XtAddressMapper xtAddressMapper;
	
	@Autowired 
	XtZdOccupationMapper xtZdOccupationMapper;
	

	@Override
	public XtUser getUserinfoById(Long userId) {
		
		return xtUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int saveUserEdit(XtUser user) {
		int userCount = xtUserMapper.updateByPrimaryKeySelective(user);
		if(userCount>0){			
			XtPerson person = xtPersonMapper.selectPersonByUserId(user.getId());
			if(person!=null){
			//个人关联的用户id
			person.setUserId(user.getId());//根据用户id更新以下信息
			person.setAge(user.getAge());//个人年龄
			person.setBirthdate(user.getBirthDate());//出生日期
			person.setBirthPlace(user.getBirthPlace());//籍贯
			person.setSocialId(user.getSocialId());//身份证
			person.setAllergicHistory(user.getAllergicHistory());//过敏史
			person.setNation(user.getNation());
			person.setAddressId(user.getAddressId());
			person.setOccupationId(user.getOccupationId());
			person.setMarry(user.getMarry());
			int personCount = xtPersonMapper.updateByPrimaryKeySelective(person); 
			if(personCount>0){
				//更新地址
				XtAddress address = new XtAddress();
				address.setAddressId(user.getAddressId());
				address.setAddress(user.getAddress());
				address.setProvince(user.getProvince());
				address.setCity(user.getCity());
				address.setCounty(user.getCounty());
				address.setRoad(user.getRoad());
				xtAddressMapper.updateByPrimaryKeySelective(address); 
			    return 1;
			  }
			}
		}
		return 0;
	}
	
	
	

}
