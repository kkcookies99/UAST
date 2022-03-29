 class Solution {
    public ListNode XXX(ListNode head) {
    	if (head == null)
    		return head;
        ListNode front = head;
        ListNode toDelete = head.next;
        while(toDelete != null) {
        	if (front.val == toDelete.val) {
        		front.next = toDelete.next;
        	}
        	else {
        	front = front.next;
        	}
        	toDelete = toDelete.next;
        	
        }
        return head;
    }
}
