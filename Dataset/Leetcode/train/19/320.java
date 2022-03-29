 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode newHead = new ListNode(0, head);
        ListNode p = newHead, q = p;
        for (int i = 0; i < n; ++i) q = q.next;
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return newHead.next;
    }
}

