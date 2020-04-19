package com.leet;

import java.util.LinkedList;

public class MergeTwoSortedLinkedLists {
	
	 private static class Node {
	        private int data;
	        Node next;
	 
	        public Node(int data) {
	            this.data = data;
	            next = null;
	        }
	    }
	 
	    Node head;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll1 = new LinkedList<Integer>();		
		ll1.add(10);
		ll1.add(30);
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(20);
		ll2.add(40);
		MergeTwoSortedLinkedLists ll = new MergeTwoSortedLinkedLists();
//		ll.mergeSortedLists(ll1,ll2);

	}
	
	public Node mergeSortedLists(Node ll1,Node ll2) {
		if(ll1==null) {
			return ll2;
		}else if(ll2==null) {
			return ll1;
		}else if(ll1.data<ll2.data) {
			
		}else {
			
		}
		return ll2;
		
	}

}
