package com.java8.stream.arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.omg.Messaging.SyncScopeHelper;

public class Arrays_Java8_Stream {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5,6,7,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//		int[] arr = { 1, 2, 3, 4, 5, 5 };

		// Sum of all the elements in the array
		IntStream is = Arrays.stream(arr);
		System.out.println("Sum of all the elements in the array : " + is.sum());

		// Sum of the elements between given indexes in the array
		IntStream is2 = Arrays.stream(arr, 2, 4);
		System.out.println("Sum of all the elements in the array between the range : " + is2.sum());

		// count of the distinct elements between given indexes in the array
		long s = Arrays.stream(arr, 3, 9).distinct().count();
		System.out.println("Number of distinct elements in the array between the given indexes : " + s);

		// Print the distinct elements between given indexes from an array
		System.out.println("Distinct elements between given indexes : ");
		Arrays.stream(arr, 3, 9).distinct().forEach(System.out::println);

		// Find All even numbers from given array or between two indexes
		IntStream a = Arrays.stream(arr, 3, 6);
		System.out.println("Find if an array has atleast even number in given array : ");
		System.out.println(a.anyMatch(n -> n % 2 == 0));

//		System.out.println(Arrays.stream(arr).reduce((x, y)->x+y));

		// Print all the elements from given array
		System.out.println("Elements in the array are : ");
		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

	}

}
