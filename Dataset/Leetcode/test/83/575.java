 class Solution {
    public ListNode XXX(ListNode head) {
        if (head==null) {
			return null;
		}
    	ListNode listnode = head;
    	while (listnode.next!=null) {
			if (listnode.val == listnode.next.val) {
				listnode.next=listnode.next.next;
			}else {
				listnode = listnode.next;
			}
			
    	}
		return head;
    }
}

