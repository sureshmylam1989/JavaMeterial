package com.cirrusLogic.Interview;

public class Stringtransform {

	/*
	 * QUESTION asked in Cirrus Logic:
	 * 
	 * A string consisting of letters A,B,C and is given. String can be transformed
	 * either by removing a letter A together with an adjacent letter B or by
	 * removing a letter C together with an adjacent letter D
	 * 
	 * 
	 * Note: BElow is my solution , please suggest if any best solution you have.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringtransform s = new Stringtransform();
		System.out.println(s.transformString("CBACD"));
	}

	public String transformString(String str) {
		int n = str.length();
		char x;
		for (int i = 1; i < str.length() - 1; i++) {
			x = str.charAt(i);
			if (x == 'A') {
				if (str.charAt(i - 1) == 'B' || str.charAt(i + 1) == 'B') {
					if (str.charAt(i - 1) == 'B') {
						str = str.substring(0, i - 1) + str.substring(i + 1, n + 1);
					}
					if (str.charAt(i - 1) == 'B') {
						str = str.substring(0, i) + str.substring(i + 2, n + 1);
					}
				}
			} else if (x == 'C') {
				if (str.charAt(i - 1) == 'D' || str.charAt(i + 1) == 'D') {
					if (str.charAt(i - 1) == 'D') {
						str = str.substring(0, i - 1) + str.substring(i + 1, n + 1);
					}
					if (str.charAt(i - 1) == 'D') {
						str = str.substring(0, i) + str.substring(i + 2, n + 1);
					}
				}
			}
		}
		if (str.contains("AB") || str.contains("BA") || str.contains("CD") || str.contains("DC")) {
			transformString(str);
		}

		return str;
	}
	
}
