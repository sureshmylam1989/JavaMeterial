package com.practice.java;

public class LongestSubString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcdefbbqwbertzyubiopn"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), max = 0;
        int[] idx = new int[128];
        for(int i=0, j=0; i<n; i++) {
            j = Math.max(j, idx[s.charAt(i)]);
            max = Math.max(max, i-j+1);
            idx[s.charAt(i)] = i+1;
        }
        
        return max;
    }

}
