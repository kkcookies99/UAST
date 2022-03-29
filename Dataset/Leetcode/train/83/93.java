class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode newHead = XXX(head.next);
        if (head.val == newHead.val) {
            return newHead;
        }else {
            head.next = newHead;
            return head;
        }
     }
}

