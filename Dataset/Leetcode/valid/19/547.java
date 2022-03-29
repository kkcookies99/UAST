 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        while (first != null) {
            first = first.next;
            if (n-- <= 0) {
                second = second.next;
            }
        }
        second.next = second.next.next;
        return dummy.next;
    }
}

