package com.leet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Median {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median;
		List<Integer> al = new ArrayList<Integer>();				
		for (int i = 0; i < nums1.length; i++) {
			al.add(nums1[i]);
		}
		for (int j = 0; j < nums2.length; j++) {
			al.add(nums2[j]);
		}		
		Collections.sort(al);
		int n = al.size();
		if ((n % 2) == 1) {
			median = al.get(n / 2);
		} else {
			median = ((double)al.get((n / 2) - 1) + (double)al.get((n / 2))) / 2;
		}
		return median;

	}

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 3,4 };
		Median sol = new Median();
		System.out.println(sol.findMedianSortedArrays(a, b));

	}

}
