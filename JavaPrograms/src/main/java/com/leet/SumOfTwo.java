package com.leet;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
	/*
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 */

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 3, 4, 5, 6, 7, 9 };
		System.out.println(new SumOfTwo().twoSum(nums, 11)[0]);
		System.out.println(new SumOfTwo().twoSum(nums, 11)[1]);

	}

}
