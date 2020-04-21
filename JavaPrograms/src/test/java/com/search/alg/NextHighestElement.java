package com.search.alg;

import java.util.Stack;

public class NextHighestElement {

	public static void main(String[] args) {
		int[] a = { 3, 5, 1, 2, 16, 8, 6, 9, 16, 9, 7 };
		nextHighest(a);
		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}
	}

	// replace each element with next highest element if any else leave the element
	public static void nextHighest(int[] a) {

		// Stack ---> push if element is > than top else pop
		Stack<Integer> st = new Stack<Integer>();

		// This to keep track of index of the element to replace
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
