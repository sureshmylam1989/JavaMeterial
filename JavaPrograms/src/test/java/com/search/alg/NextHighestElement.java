package com.search.alg;

import java.util.Stack;

public class NextHighestElement {

	public static void main(String[] args) {
		int[] a = { 5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4 };
		nextHighest(a);
		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}
	}

	public static void nextHighest(int[] a) {
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> index = new Stack<Integer>();
		int counter = 0;
		for (int i = 0; i < a.length;) {
			if (!st.empty() && a[i] > st.peek()) {
				st.pop();
				a[index.pop()] = a[i];
			} else {
				st.push(a[i]);
				index.push(counter);
				i++;
				counter++;
			}
		}
	}
}
