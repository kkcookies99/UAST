     public ListNode XXX(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (n == 0) {
            return head;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }

