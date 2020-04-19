package com.practice.java;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(153423646));
	}

	public static int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int last = x % 10;

			if (rev*10 > Integer.MAX_VALUE) {
				return 0;
			} else if (rev*10 == Integer.MAX_VALUE) {
				if (last > 7) {
					return 0;
				}
			}

			if (rev*10 < Integer.MIN_VALUE) {
				return 0;
			} else if (rev*10 == Integer.MIN_VALUE) {
				if (last < -8) {
					return 0;
				}
			}
			
			x = x / 10; 
			rev = rev * 10 + last;
		}

		return rev;

	}

}
