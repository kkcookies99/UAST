class Solution {
    public ListNode XXX(ListNode head) {
        for (ListNode c = head, p = null; c != null; c = c.next) {
            if (p != null && p.val == c.val) {
                p.next = c.next;
            } else {
                p = c;
            }
        }
        return head;
    }
}

