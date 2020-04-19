package com.collections;



public class AddTwoNumbersLinkedList {
	static ListNode head1,head2;


	public static void main(String[] args) {
		AddTwoNumbersLinkedList.head1 = new ListNode(2);
		AddTwoNumbersLinkedList.head1.next = new ListNode(4);
		AddTwoNumbersLinkedList.head1.next.next = new ListNode(3);
		
		AddTwoNumbersLinkedList.head2 = new ListNode(5);
		AddTwoNumbersLinkedList.head2.next = new ListNode(6);
		AddTwoNumbersLinkedList.head2.next.next = new ListNode(4);
		
		System.out.println(addTwoNumbers(head1,head2).d);
		System.out.println(addTwoNumbers(head1,head2).d);
		System.out.println(addTwoNumbers(head1,head2).d);
		


	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.d : 0;
	        int y = (q != null) ? q.d : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
}
