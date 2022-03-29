     public ListNode XXX(ListNode head, int n) {
        ListNode slow = head;
        ListNode node = slow;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return node;
    }

