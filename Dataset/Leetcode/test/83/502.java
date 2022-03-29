  public ListNode XXX(ListNode head) {
        ListNode res = new ListNode(-1);
        res.next = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return res.next;
    }

