package com.coding;

public class RepeatingValues_RemoveDup {

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}

	public static void printRepeating(int[] arr, int l) {
		int i;
		System.out.println("repeating values are : ");
		for (i = 0; i < l; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println(Math.abs(arr[i]));
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 3, 6, 6, 0, 0 };
		int arr_size = arr.length;
		printRepeating(arr, arr_size);

		int[] nums = { 1, 1, 2, 3, 4, 4 };
		System.out.println("Size of an array after removing the duplicates : " + removeDuplicates(nums));
	}

}
