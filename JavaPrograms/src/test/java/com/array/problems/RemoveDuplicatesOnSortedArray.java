package com.array.problems;

public class RemoveDuplicatesOnSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 5 };
		int len = arr.length;
		int j = 0;
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j = j + 1;
			}
		}
		arr[j] = arr[len - 1];
		for (int i = 0; i < len; i++) {
			if (i <= j)
				System.out.println(arr[i]);
		}
	}

}
