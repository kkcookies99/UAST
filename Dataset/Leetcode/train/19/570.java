     public ListNode XXX(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        while (i < n && fast != null) {
            fast = fast.next;
            i++;
        }
        if(fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

