package com.overriding.poly;

public class Child extends Parent{
	
	public void run() {
		System.out.println("Child running");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.run();
	}

}
