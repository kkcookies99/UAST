 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode fast = dummy, slow = dummy;

        int time = n+1;
        while(time-->0) {
            fast = fast.next;
        }
        
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}

