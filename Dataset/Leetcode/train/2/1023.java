 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        return solutionTrue(l1,l2,0);
    }
    public ListNode solutionTrue(ListNode l1, ListNode l2, int decimal) {
    	
    	if (l1 == null && l2 == null && decimal == 0) {
    		return null;
    	}
    	
    	int sum = decimal;
    	if (l1 != null) {
    		sum += l1.val;
    	}
    	if (l2 != null) {
    		sum += l2.val;
    	}
    	
    	ListNode listNode = new ListNode(sum % 10);
    	
    	decimal = sum / 10;
    	
    	l1 = l1 == null ? null : l1.next;
    	l2 = l2 == null ? null : l2.next;
    	listNode.next = solutionTrue(l1, l2, decimal);
    	
    	return listNode;
    }
}

