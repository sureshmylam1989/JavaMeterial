package com.arraylist.comparable.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeArrayList {

	public static void main(String[] args) {
		
		EmployeeDetails e1 = new EmployeeDetails("Suresh", 103, 50000);
		EmployeeDetails e2 = new EmployeeDetails("Kumar", 101, 35000);
		EmployeeDetails e3 = new EmployeeDetails("Mylam", 104, 40000);
		
		List<EmployeeDetails> al = new ArrayList<EmployeeDetails>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println("Before Sorting :");
		System.out.println(al);
		
		//Sort using Comparable
		Collections.sort(al);
		System.out.println("After Sorting by salary using comparable:");
		System.out.println(al);
		
		//Sort using Comparator
		Collections.sort(al,new SortById());
		System.out.println("After Sorting by id using comparator:");
		System.out.println(al);
		
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("reverse Sorting by id");
		System.out.println(al);
		
	}

}
