     public ListNode XXX(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        //虚拟头结点
        ListNode realHead = new ListNode(0, head);
        ListNode fast = realHead;
        ListNode slow = realHead;

        while (fast.next != null) {
            if (n-- > 0) {
                fast = fast.next;
                continue;
            }
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return realHead.next;
    }

