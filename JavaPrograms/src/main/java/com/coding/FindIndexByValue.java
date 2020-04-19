package com.coding;

public class FindIndexByValue {

	public static void main(String[] args) {

		// int[] arr = new int[]{3,5,7,9,11,13,15,17,19};
		int[] arr = new int[] { 17,19, 3, 5, 7, 9, 11, 13, 15 };
		// int[] arr = new int[]{3,4,5,6,7};
		// int[] arr = new int[]{6,7,3,4,5};
		// int[] arr = new int[]{};
		int len = arr.length;		
		int value = 5;
		int inc = 2;
		if (len == 0) {
			System.out.println("Array is empty");
			System.exit(0);
		}
		if (arr[0] == value) {
			System.out.println(0);
		}
		if (arr[len-1] == value) {
			System.out.println(len);
		}
		int index = 0;
		if (arr[len-1] > value) {
			int ind = (arr[len-1] - value) / inc;
			index= len-ind-1;
		} else if (arr[len-1] < arr[0]) {
			index = (value - arr[0]) / inc;
		}
		if(arr[index]==value) {
			System.out.println(index);
		}else {
			System.out.println("Given value doesn't present in array");
		}
	}

}
