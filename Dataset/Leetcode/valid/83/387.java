class Solution {
    public ListNode XXX(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            while(cur != null && cur.next != null && cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return head;
    }
}

