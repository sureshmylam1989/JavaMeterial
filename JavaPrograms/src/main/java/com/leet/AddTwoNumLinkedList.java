package com.leet;

public class AddTwoNumLinkedList {

	static ListNode head1, head2;
	
	//https://www.geeksforgeeks.org/data-structures/linked-list/#singlyLinkedList

	public static void main(String[] args) {
		AddTwoNumLinkedList ll = new AddTwoNumLinkedList();
		ll.head1 = new ListNode(2);
		ll.head1.next = new ListNode(4);
		ll.head1.next.next = new ListNode(3);

		ll.head2 = new ListNode(5);
		ll.head2.next = new ListNode(6);
		ll.head2.next.next = new ListNode(4);

		ListNode resNode = addTwoNumbers(head1, head2);
		
		while(resNode!=null) {
			System.out.println(resNode.d);
			resNode = resNode.next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = null;
		ListNode temp = null;
		ListNode prev = null;

		int sum = 0, carry = 0;

		while (l1 != null || l2 != null) {
			sum = carry + (l1!=null?l1.d:0) + (l2!=null? l2.d:0);

			if (sum >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			carry = sum / 10;
			sum = sum % 10;

			temp = new ListNode(sum);

			if (res == null) {
				res = temp;
			} else {
				prev.next = temp;
			}
			prev = temp;

			if (l1 != null) {
				l1 = l1.next;
			}

			if (l2 != null) {
				l2 = l2.next;
			}
			
			if(carry>0) {
				temp.next = new ListNode(carry);
			}
		}

		return res;
	}

}
