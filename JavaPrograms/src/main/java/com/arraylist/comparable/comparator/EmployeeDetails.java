package com.arraylist.comparable.comparator;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
	String name ;;
	int id;
	int salary ;
	
	public EmployeeDetails(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary = salary;
	}
	
	public String toString() {
		return name+ " " +id+" " +salary;
		
	}



	@Override
	public int compareTo(EmployeeDetails o) {
		// TODO Auto-generated method stub
		return salary-o.salary;
	}

}
