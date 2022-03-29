class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            if (pre == null) {
                pre = cur;
                cur = cur.next;
                continue;
            }
            if (pre.val == cur.val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}

