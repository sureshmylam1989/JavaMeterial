package com.array.problems;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		int[] b = { 2, 4, 5, 6, 8, 10, 11, 12 };
		int[] res = merge(a, b);
		for (int z = 0; z < res.length; z++) {
			System.out.println(res[z]);
		}
	}

	/**
	 * This method will merge two sorted arrays into another sorted array
	 */
	public static int[] merge(int[] a, int[] b) {
		if (a.length == 0) {
			return b;
		}
		if (b.length == 0) {
			return a;
		}
		int i = 0, j = 0, k = 0;
		int[] result = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				result[k] = a[i];
				k++;
				i = i + 1;
			} else {
				result[k] = b[j];
				k++;
				j = j + 1;
			}
		}
		if (j == b.length) {
			for (int x = i; x < a.length; x++) {
				result[k] = a[x];
				k++;
			}
		}
		if (i == a.length) {
			for (int y = j; y < b.length; y++) {
				result[k] = b[y];
				k++;
			}
		}

		return result;
	}

}
