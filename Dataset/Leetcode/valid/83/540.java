 class Solution {
    public ListNode XXX(ListNode head) {
                ListNode dummyhead = new ListNode(0);
		ListNode curr = dummyhead;
		curr.next = head;
		if(head==null || head.next==null) return head;
		curr = curr.next; head = head.next;
		while(head!=null) {	
			curr.next = head;
			if(curr.val!=head.val) 	curr = curr.next;
			head = head.next;
		}
		curr.next = null;
		return dummyhead.next;
    }
}

