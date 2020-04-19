package com.collections;

public class CircularLinkedListExample {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static Node addToEmpty(Node last, int x) {
		if (last != null)
			return last;

		Node node = new Node(x);
		last = node;
		last.next = last;

		return last;

	}
	
	public static void traverse(Node last) {
		Node temp = last;
		if(last==null)
			return;
		Node p=last.next;
		do {
			System.out.println(p.data);
			p=p.next;
			
		}while(p!= last.next);
	}
	
	public static Node addBegin(Node last,int x) {
		Node node = new Node(x);
		node.next = last.next;
		last.next = node;
		
		return last;
	}
	
	

	public static void main(String[] args) {
		CircularLinkedListExample cll = new CircularLinkedListExample();

		Node last = null;

		last = addToEmpty(last, 6);
	    last = addBegin(last, 4); 
	    last = addBegin(last, 7); 
//	    last = addBegin(last, 2); 
//	    last = addEnd(last, 8); 
//	    last = addEnd(last, 12); 
//	    last = addAfter(last, 10, 8); 
	    traverse(last); 

	}

}
