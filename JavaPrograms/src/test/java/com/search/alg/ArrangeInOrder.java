package com.search.alg;

public class ArrangeInOrder {
	/**
	 * 
	 * Arrange the green, blue and red balls in an order of Blue-->Red-->Green.
	 */

	public static void main(String[] args) {
		// Input
		char[] ch = { 'g', 'b', 'r', 'b', 'b', 'g', 'g', 'g', 'r', 'b', 'r', 'g' };

		// Expected Output
		// char[] ch = { 'b', 'b', 'b', 'b', 'r', 'r', 'r', 'g', 'g', 'g', 'g', 'g' };
		arrangeOrder(ch);
		System.out.println(ch);
	}

	public static char[] arrangeOrder(char[] ch) {
		int start = 0;
		int end = ch.length - 1;
		for (int i = 0; i <= end;) {
			if (ch[i] == 'b') {
				swap(ch, start, i);
				start++;
				i++;

			} else if (ch[i] == 'r') {
				i++;

			} else if (ch[i] == 'g') {
				swap(ch, i, end);
				end--;
			}
		}
		return ch;
	}

	public static char[] swap(char[] ch, int start, int i) {
		char temp = ch[start];
		ch[start] = ch[i];
		ch[i] = temp;
		return ch;

	}

}
