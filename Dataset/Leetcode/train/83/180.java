public ListNode XXX(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val != p.next.val) p = p.next;
            else p.next = p.next.next;
        }

        return head;
    }

