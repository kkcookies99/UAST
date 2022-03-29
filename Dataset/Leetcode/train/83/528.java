 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null||head.next == null) return head;
        ListNode p = head;
        ListNode next = p.next;
        while (next != null) {
            if (p.val == next.val) next = next.next;
            else {
                p.next = next;
                p = next;
                next = p.next;
            }
        }
        p.next = next;
        return head;
    }
}

