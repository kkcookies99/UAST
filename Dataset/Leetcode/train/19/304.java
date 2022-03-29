 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = head;
        ListNode cur = dummy;
        for (int i = 0; i < n && pre != null; i++) {
            pre = pre.next;
        }

        while (pre != null) {
            cur = cur.next;
            pre = pre.next;
        }

        if (cur.next != null) {
            cur.next = cur.next.next;
        }

        return dummy.next;
    }
}

