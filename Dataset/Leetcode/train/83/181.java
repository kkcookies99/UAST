    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.val != head.next.val) head.next = XXX(head.next);
        else head = XXX(head.next);
        return head;
    }

