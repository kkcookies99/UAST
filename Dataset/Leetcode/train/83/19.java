    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head.next;
        ListNode pre = head;
        while (current != null) {
            if (current.val != pre.val) {
                pre.next = current;
                pre = current;
            }
            current = current.next;
        }
        pre.next = null;
        return head;
    }

