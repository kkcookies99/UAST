 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head == null) return head;
        ListNode vhead = new ListNode(-1, head);
        ListNode p = vhead, q = vhead;
        while (n-- > 0 && q.next != null) q = q.next;
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return vhead.next;
    }
}

