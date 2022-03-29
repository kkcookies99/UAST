 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fast = head;
        ListNode low = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            low = low.next;
        }
        low.next = low.next.next;
        return head;
    }
}

