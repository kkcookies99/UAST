     public ListNode XXX(ListNode head, int n) {
        ListNode realHead = new ListNode(0, head);
        ListNode fast = realHead;
        ListNode slow = realHead;
        int i = 0;
        while (fast != null) {
            if (i <= n) {
                fast = fast.next;
                i++;
                continue;
            }
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        
        return realHead.next;
    }

