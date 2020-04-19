package com.collections;

public class DoublyLinkedListWxample {
	static Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}

	}

	public void insertAtBegin(int x) {
		Node node = new Node(x);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	public static void deleteGivenNode(Node dn) {
		Node temp = dn;
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;

	}

	public static void reverseLinkedList() {
		Node current = head;
		Node temp = null;
		if (current == null) {
			return;
		}
		if (current.next == null) {
			return;
		}
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if (temp != null)
			head = temp.prev;

	}

	public static void insertAfterGivenNode(Node prev_node, int x) {
		Node node = new Node(x);
		node.next = prev_node.next;
		prev_node.next = node;
		node.prev = prev_node;
		if (node.next != null) {
			node.next.prev = node;
		}
	}

	public static void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedListWxample dll = new DoublyLinkedListWxample();
		dll.insertAtBegin(3);
		dll.insertAtBegin(5);
		dll.insertAtBegin(1);
		dll.insertAtBegin(6);
		printList();
		insertAfterGivenNode(dll.head.next, 4);
		System.out.println("After inserting the node");
		printList();

		deleteGivenNode(dll.head.next.next.next);
		System.out.println("After deleting the given node");
		printList();

		reverseLinkedList();
		System.out.println("After reversing the doubly linked list");
		printList();

	}

}
