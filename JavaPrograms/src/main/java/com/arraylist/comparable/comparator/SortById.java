package com.arraylist.comparable.comparator;

import java.util.Comparator;

public class SortById implements Comparator<EmployeeDetails>{


	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
//		return o1.salary-o2.salary;
		return o1.id-o2.id;
	} 

}
