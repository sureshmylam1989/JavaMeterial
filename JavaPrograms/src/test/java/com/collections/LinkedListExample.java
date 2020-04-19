package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// https://www.geeksforgeeks.org/linked-list-in-java/

	public static void main(String[] args) {
		LinkedListExample llist = new LinkedListExample();

		llist.insertAtBegin(7);
		llist.insertAtBegin(1);
		llist.insertAtBegin(3);
		llist.insertAtBegin(2);
		llist.insertAtBegin(8);

		System.out.println("\nCreated Linked list is: ");
		llist.printList();

		System.out.println("Length of list " + llist.findLength());

		System.out.println("Given Element is present " + llist.isNodeExist(3));

//        llist.deleteNodeAtPosition(4);  // Delete node at position 4 
//		llist.deleteNode(3);			// Delete node 3
//		llist.deleteLinkedList(); // Delete LinkedList

//		llist.printList();

	}

	public boolean isNodeExist(int x) {
		boolean flag = false;
		Node temp = head;

		while (temp!=null) {
			if (temp.data == x) {
				flag = true;
			}

			temp = temp.next;
		}
		

		return flag;
	}

	public int findLength() {
		Node temp = head;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter = counter + 1;
		}

		return counter;

	}

	public void deleteNode(int x) {
		Node temp = head;
		Node prev = null;
		while (temp.data != x) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;

	}

	public void deleteLinkedList() {
		head = null;
	}

	public void deleteNodeAtPosition(int index) {
		Node temp = head;
		Node prev = null;
		int position = index;
		int i = 0;
		if (head == null) {
			return;
		}

		if (position == 0) {
			head = temp.next;
		}

		while (i < position) {
			prev = temp;
			temp = temp.next;
			i = i + 1;
		}
		prev.next = temp.next;

	}

	public void insertAtBegin(int num) {
		Node node = new Node(num);
		node.next = head;
		head = node;
	}

	public void printList() {
		Node wh = head;
		while (wh != null) {
			System.out.println(wh.data);
			wh = wh.next;

		}

	}

}
