package com.array.problems;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, -3, -2, 2,3,1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };
		maxSum(arr);

	}
	/*
	 * This method find the Sub Array which has the maximum sum
	 */
	public static int maxSum(int[] arr) {

		if (arr == null) {
			return 0;
		}
		int max_sum = arr[0];
		int maxAt = 0;
		int start = 0;
		int end = 0;
		int tempStart = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			maxAt = maxAt + arr[i];
			if (maxAt > max_sum) {
				max_sum = maxAt;
				start = tempStart;
				end = i;
			} else if (maxAt < 0) {
				maxAt = 0;
				tempStart = i + 1;
			}
		}
		return max_sum;

	}

}
