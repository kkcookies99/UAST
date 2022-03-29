 class Solution {
    public ListNode XXX(ListNode head, int n) {
        return recursiveRemove(head, n, new AtomicInteger());
    }

    ListNode recursiveRemove(ListNode head, int n, AtomicInteger idx) {
        if (head == null) {
            return head;
        }
        head.next = recursiveRemove(head.next, n, idx);
        if (n == idx.incrementAndGet()) {
            return head.next;
        }
        return head;
    }
}

