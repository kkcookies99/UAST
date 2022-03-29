 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode ph = head;
        ListNode p1 = l1;
        ListNode p2 = l2;
        boolean carry = false;
        while (p1 != null || p2 != null) {
            int pv1 = 0;
            if (p1 != null) {
                pv1 = p1.val;
                p1 = p1.next;
            }
            int pv2 = 0;
            if (p2 != null) {
                pv2 = p2.val;
                p2 = p2.next;
            }
            int r = pv1 + pv2 + (carry ? 1 : 0);
            carry = false;
            ph.next = new ListNode(r % 10);
            if (r >= 10) {
                carry = true;
            }
            ph = ph.next;
        }
        if (carry) {
            ph.next = new ListNode(1);
        }
        return head.next;
    }
}

