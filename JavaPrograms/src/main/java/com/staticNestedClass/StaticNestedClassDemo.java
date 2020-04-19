package com.staticNestedClass;

public class StaticNestedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * This is for non static nested class
		 */
//		StaticNestedClass obj1 = new StaticNestedClass();
//		StaticNestedClass.abcd snc = obj1.new abcd();
//		snc.dis();
		
		/*
		 * This is for static nested class
		 */
		StaticNestedClass.abcd obj = new StaticNestedClass.abcd();
		obj.dis();
		

	}

}
