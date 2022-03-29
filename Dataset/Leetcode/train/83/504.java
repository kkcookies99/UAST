 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode node = head, next = null;
        
        while (node != null) {
            next = node.next;
            if (next == null) {
                break;
            }
            
            if (next.val == node.val) {
                node.next = next.next;
                next = null;
                continue;
            }
            
            node = next;            
        }
        
        return head;        
    }
}

