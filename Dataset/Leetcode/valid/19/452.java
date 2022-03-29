 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode pre = new ListNode();
        ListNode fast = pre, slow = pre;
        pre.next = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (true) {
            if (fast.next == null) {
                slow.next = slow.next.next;
                return pre.next;
            }
            fast = fast.next;
            slow = slow.next;

        }
    }
}

