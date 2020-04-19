package com.java8.lambda;

public class LambdaExample {

	public static void main(String[] args) {
		int width = 10;
		int a =5;
		
//		//Without Lambda expression
//		Drawable d = new Drawable() {
//			
//			@Override
//			public void draw() {
//				System.out.println("drawing "+ width);
//				
//			}
//		};
//		
//		d.draw();
		
		
		//With Lambda expression
		Drawable d2 = (int b)->System.out.println("drawing lambda "+ width + b);

		d2.draw(a);
	}
	

}
