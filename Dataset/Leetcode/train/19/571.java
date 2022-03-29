     public ListNode XXX(ListNode head, int n) {
        ListNode dummy = head;
        int len = 0;
        while (dummy != null) {
            len++;
            dummy = dummy.next;
        }
        dummy = head;
        if(n == len) return head.next;
        for (int i = 0; i < len - n - 1; i++) {
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return head;
    }

