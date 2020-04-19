package com.collections;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class LinkedListPalindrom {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedListPalindrom llist = new LinkedListPalindrom();

		llist.insertAtBegin(1);
		llist.insertAtBegin(2);
		llist.insertAtBegin(3);
		llist.insertAtBegin(3);
		llist.insertAtBegin(1);

		System.out.println(isPalindrom());

	}

	public static boolean isPalindrom() {
		Node temp = head;
		int counter = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (temp != null) {
			map.put(counter, temp.data);
			temp=temp.next;
			counter = counter + 1;
		}
		int back = counter / 2 - 1;
		int forward = 0;
		if (isOdd(counter)) {
			forward = counter / 2 + 1;
		} else {
			forward = counter / 2;
		}
		for (int i = back; i >= 0; i--) {
			if (map.get(i) != map.get(forward)) {
				
			
				return false;
			}
			forward = forward+1;
		}
		return true;

	}

	public static boolean isOdd(int x) {
		if (x % 2 == 0)
			return false;

		return true;

	}

	public void insertAtBegin(int num) {
		Node node = new Node(num);
		node.next = head;
		head = node;
	}

}
