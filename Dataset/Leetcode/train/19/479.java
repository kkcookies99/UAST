     public ListNode XXX(ListNode head, int n) {
        ListNode fast = head;
        while (--n > 0) { // 先减后对比
            fast = fast.next;
        }
        ListNode ret = new ListNode(-1); // 新增一个头结点
        ret.next = head;

        ListNode slow = ret;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return ret.next;
    }

