package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaIntegerExample {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(4);
		ls.add(2);
		ls.add(3);
		
		ls.forEach(n->System.out.println(n));
		
		ls.forEach(n->{if(n%2==0)System.out.println(n);});
		
		
		
		
	}

}
