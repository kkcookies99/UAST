class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE, head);
        ListNode cur = head, pre = dummyHead;
        while (cur != null) {
            if (cur.val == pre.val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = pre.next;
        }
        return dummyHead.next;
    }
}

