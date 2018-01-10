package com.huatuo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.domain.XtSpecialty;
import com.huatuo.customer.service.SpecialtyService;

@RequestMapping(value = "specialty")
@RestController
public class SpecialtyController {
	
	@Autowired 
    private SpecialtyService specialtyService;
	
	@GetMapping(value="findSpecialty")
	public List<XtSpecialty> getSpecialtyInfo(){
	   return specialtyService.getSpecialtyInfo();
		
	}

}
