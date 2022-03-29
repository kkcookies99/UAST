 class Solution {
    public ListNode XXX(ListNode head) {
       if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.val == head.next.val) {
            head.next = head.next.next;
            XXX(head);
        } else {
            XXX(head.next);
        }
        return head;
    }
}

