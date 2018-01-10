package com.huatuo.customer.base.util;

import java.util.Comparator;

import com.huatuo.customer.domain.Doctor;

@SuppressWarnings("rawtypes")
public class ComparatorObjectAsc implements Comparator{

	@Override
	public int compare(Object o0, Object o1) {
		Doctor doctor0 = (Doctor)o0;
		Doctor doctor1 = (Doctor)o1;
		int flag1 = doctor0.getQueuingNumber();
		int flag2 = doctor1.getQueuingNumber();
		if(flag1<flag2){
			return -1;
		}else if(flag1>flag2){
			return 1;
		}else{
			return 0;
		}
	}

}
