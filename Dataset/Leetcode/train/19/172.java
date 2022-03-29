 class Solution {
    public ListNode XXX(ListNode head, int n) {
       if (head == null) {
			return head;
		}
		ListNode left = head;
		ListNode right = head;
		ListNode preLeft = head;
		
		for(int i = 0; i < n;i++) {
			right = right.next;
		}
		
		while(right != null) {
			right = right.next;
			preLeft = left;
			left = left.next;
			
		}
		
		preLeft.next = left.next;
		return left == head ? head.next : head;
    }
}

