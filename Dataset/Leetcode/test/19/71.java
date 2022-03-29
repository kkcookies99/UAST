 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
        }
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return dummyHead.next;
    }
}

