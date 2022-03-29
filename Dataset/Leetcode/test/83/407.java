 class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null) return head;
		ListNode node=head;
		while(head.next!=null){
			if(head.next.val==head.val){
				head.next=head.next.next;
			}
			else
				head=head.next;
		}
		return node;
    }
}

