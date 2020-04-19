package com.collections;

public class MergeTwoSortedLinkedList {
	static Node head1;
	static Node head2;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;

		}
	}

	public static Node merge(Node p, Node q) {
		Node new_head = null;
		Node s = null;
		if (p == null)
			return q;
		if (q == null)
			return p;
		if (p != null && q != null) {
			if (p.data <= q.data) {
				s = p;
				p = s.next;
			} else {
				s = q;
				q = s.next;
			}
		}
		new_head = s;
		while (p != null && q != null) {
			if (p.data <= q.data) {
				s.next = p;
				s = p;
				p = s.next;
			} else {
				s.next = q;
				s = q;
				q = s.next;
			}
			if (p == null)
				s.next = q;
			if (q == null)
				s.next = p;
		}

		return new_head;

	}

	public static void main(String[] args) {
		MergeTwoSortedLinkedList mts = new MergeTwoSortedLinkedList();
		mts.head1 = new Node(10);
		mts.head1.next = new Node(50);
		mts.head1.next.next = new Node(70);
		mts.head1.next.next.next = new Node(90);
		mts.head1.next.next.next.next = new Node(100);

		mts.head2 = new Node(20);
		mts.head2.next = new Node(30);
		mts.head2.next.next = new Node(40);
		mts.head2.next.next.next = new Node(60);
		mts.head2.next.next.next.next = new Node(80);

		Node sort = merge(head1, head2);
		while (sort != null) {
			System.out.println(sort.data);
			sort = sort.next;
		}

	}

}
