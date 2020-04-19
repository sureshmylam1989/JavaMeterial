package com.practice.java;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("4123 retrytvgub 4123"));
	}

	public static int myAtoi(String str) {
		char[] characters = str.toCharArray();
		int res = 0;
		boolean negative = false;

		int j = 0;
		while (j < characters.length && characters[j] == ' ')
			j++;

		if (j < characters.length) {
			if (characters[j] == '-' || characters[j] == '+') {
				negative = characters[j] == '-';
				j++;
			}
		}

		while (j < characters.length && isNumDigit(characters[j])) {
			char letter = characters[j];
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && letter > '7')) {
				return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			res *= 10;
			res += letter - '0';
			j++;
		}
		if (negative) {
			res *= -1;
		}
		return res;
	}

	public static boolean isNumDigit(char letter) {
		return letter >= '0' && letter <= '9';
	}

}
