class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur = head, nxt;
        while (cur != null) {
            nxt = cur.next;
            if (nxt == null || nxt.val != cur.val) {
                cur = nxt;
                continue;
            }

            while (nxt.next != null && nxt.val == nxt.next.val) {
                nxt = nxt.next;
            }

            cur.next = nxt.next;
            nxt.next = null;
            cur = cur.next;
        }
        return head;
    }
}

