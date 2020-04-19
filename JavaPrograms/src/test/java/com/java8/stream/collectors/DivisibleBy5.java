package com.java8.stream.collectors;

import java.util.stream.Stream;

public class DivisibleBy5 {

	public static void main(String[] args) {
		int lim = 100/5;
		// TODO Auto-generated method stub
		Stream.iterate(1,element->element+1).
		filter(element->element%5==0).
		limit(lim).forEach(System.out::println);
		
		
		Stream.iterate(1, element->element+1).filter(element->element%3==0).limit(lim).forEach(System.out::println);
		
		
	}

}
