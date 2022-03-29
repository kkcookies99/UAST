class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next == null && l1.val + l2.val < 10){
    		return new ListNode(l1.val + l2.val);
    	}
    	if (l1.val + l2.val >= 10 && l1.next != null) {
    		l1.next.val += 1;
    	}
    	if (l1.val + l2.val >= 10 && l1.next == null) {
    		l1.next = new ListNode(1);
    	}
    	ListNode resultList = new ListNode((l1.val + l2.val) % 10);
    	resultList.next = XXX(l1.next == null ? new ListNode(0) : l1.next, l2.next == null ? new ListNode(0) : l2.next);
    	return resultList;
    }
}