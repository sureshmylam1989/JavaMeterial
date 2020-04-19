package com.leet;

public class ReverseInt {
	int rev = 0;
	public int reverse(int x) {
		if (x != 0) {
			int n = x % 10;
			x = x / 10;
			rev = n + 10 * rev;
			reverse(x);
		}
		return rev;
	}

	public static void main(String[] args) {
		ReverseInt s = new ReverseInt();
		System.out.println(s.reverse(-1345));
	}
}
