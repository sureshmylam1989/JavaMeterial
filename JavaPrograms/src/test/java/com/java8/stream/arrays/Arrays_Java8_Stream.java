package com.java8.stream.arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.omg.Messaging.SyncScopeHelper;

public class Arrays_Java8_Stream {

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] arr = {1,2,3,4,5,5};
		//Sum of the array
		IntStream is = Arrays.stream(arr,2,4);
		System.out.println(is.sum());
		
//		int sum = is.sum();
//		System.out.println(sum);
		
		long s = Arrays.stream(arr,3,6).distinct().count();
		System.out.println(s);
		System.out.println(Arrays.stream(arr,3,6).count());
		
		Arrays.stream(arr,3,6).distinct().forEach(System.out::println);
		
		IntStream a = Arrays.stream(arr,5,6);
		System.out.println(a.anyMatch(n->n%2==0));
		
		
//		System.out.println(Arrays.stream(arr).reduce((x, y)->x+y));
//		
//		Arrays.stream(arr).forEach(e->System.out.print(e+ " "));
//		
		
		
		

	}

}
