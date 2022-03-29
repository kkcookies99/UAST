class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode node = new ListNode(Integer.MAX_VALUE);
        node.next = head;
        
        ListNode cur = node;
        int curVal = node.val;
        
        while(cur.next != null) {
            curVal = cur.val;
            if (cur.next.val == curVal) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return node.next;   
    }
}

