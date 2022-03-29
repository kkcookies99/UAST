    public ListNode XXX(ListNode head) {
        if (head == null)
            return head;
        ListNode h = head;
        ListNode current = head;
        ListNode next = head.next;
        while (next != null) {
            if (current.val != next.val) {
                current = next;
            } else {
                current.next = next.next;
            }
            next = next.next;
        }
        return h;
    }

