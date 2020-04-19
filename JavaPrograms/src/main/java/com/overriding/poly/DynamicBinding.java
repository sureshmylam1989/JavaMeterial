package com.overriding.poly;

public class DynamicBinding {
	
	public boolean equals(DynamicBinding other) {
		System.out.println("Inside of Test.equals");
		return false;
	}
	
	 @Override
	    public boolean equals(Object other) {
	        System.out.println("Inside of Test.equals ot type Object");
	        return false;
	    }

	public static void main(String[] args) {
		Object t1 = new DynamicBinding();
		Object t2 = new DynamicBinding();
		DynamicBinding t3 = new DynamicBinding();
		Object o1 = new Object();

		 o1.equals(t2);
		 o1.equals(t3);
		int count = 0;
		System.out.println(count++);// prints 0
		t1.equals(t2);
		System.out.println(count++);// prints 1
		t1.equals(t3);
		System.out.println(count++);// prints 2
		t3.equals(o1);
		System.out.println(count++);// prints 3
		t3.equals(t3);
		System.out.println(count++);// prints 4
		t3.equals(t2);
	}
}
