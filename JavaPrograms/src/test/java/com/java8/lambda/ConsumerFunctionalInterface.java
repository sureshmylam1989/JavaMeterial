package com.java8.lambda;

public class ConsumerFunctionalInterface {
	 interface FuncInter1 
	    { 
	        int operation(int a, int b); 
	    }
	 
	 interface FuncInter2{
		 void syaMessage(String message);
	 }
	
	 
	 private int operate(int a ,int b, FuncInter1 obj) {
		 return obj.operation(a, b);
	 }
	 


	public static void main(String[] args) {
		 // operation is implemented using lambda expressions 
		FuncInter1 add = (x,y)->x+y;
		FuncInter1 multiply = (x,y)-> x * y;

		ConsumerFunctionalInterface cfi = new ConsumerFunctionalInterface();
		System.out.println(cfi.operate(5, 6, add));
		System.out.println(cfi.operate(5, 6, multiply));
		FuncInter2 fi2 = (message)->System.out.println(message + "qwerty");
		fi2.syaMessage("message123456");

	}

}
