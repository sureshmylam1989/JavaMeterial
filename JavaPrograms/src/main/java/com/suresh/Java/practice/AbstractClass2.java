package com.suresh.Java.practice;

public class AbstractClass2 extends Abstract_Class{
	
	
	@Override
	void display3() {
		System.out.println("display3");
		
	}

	@Override
	void display4() {
		System.out.println("display4");
		
	}
public static void main(String[] args) {
		
		Abstract_Class ab1 = new AbstractClass2() ;
		ab1.display3();
		ab1.display4();
		ab1.display2();
		
		
	}

}
