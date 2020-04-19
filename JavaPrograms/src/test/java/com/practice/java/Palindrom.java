package com.practice.java;

public class Palindrom {

	public static void main(String[] args) {
		int x = -123;
		
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		int len = Integer.toString(x).length();
		for (int i = 0; i <len / 2; i++) {
			if (!((Integer.toString(x).charAt(i))==(Integer.toString(x).charAt(len-(i+1))))) {
				return false;
			}
		}
		return true;

	}
}
