package com.test.leetcode;

public class TwoZeroSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ListNode newHead = null;
	
	public ListNode reverseList(ListNode head) {
		this.newHead = head;
		TwoZeroSix t = new TwoZeroSix();
		t.reverseList_2(head);
		return newHead;
	}
	
	public ListNode reverseList_2(ListNode head) {
		if (head == null) return head;
		else {
			if (head.next == null)this.newHead = head;
			ListNode tail = reverseList_2 (head.next);
			if(head != null){
				head.next = null;
			}
			if(tail != null){
				tail.next = head;
			}
		}
		return head;
    }

}

class ListNode{
	int val;
	ListNode next;
	ListNode (int X){
		this.val = X;
	}
}
