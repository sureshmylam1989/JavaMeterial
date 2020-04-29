package com.set;

import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TreeSet1 {

	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(1);
		q.add(3);
		q.add(6);
		System.out.println(q);
		q.peek();
		System.out.println(q);
		q.poll();
		System.out.println(q);

		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		System.out.println(ad.descendingIterator());

	}

}
