class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.val == head.next.val) {
            head = XXX(head.next);
        } else {
            head.next = XXX(head.next);
        }
        return head;
    }
}

