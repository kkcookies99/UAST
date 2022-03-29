 class Solution {
    public ListNode XXX(ListNode head, int n) {
        //为了避免更过情况的讨论，还是使用头结点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(n-- > 0) {
            fast = fast.next;
        }
        ListNode pre = null;
        while(fast != null) {
            pre = slow;
            fast = fast.next;
            slow = slow.next;
        }
        pre.next = slow.next;
        return dummy.next;
    }
}

