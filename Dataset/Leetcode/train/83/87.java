class Solution {
    public ListNode XXX(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.next != null) {
                if (cur.next.val == cur.next.next.val) {
                    cur.next = cur.next.next;
                }else {
                    cur = cur.next;
                }
            }else {
                break;
            }
        }

        return dummy.next;
    }
}

