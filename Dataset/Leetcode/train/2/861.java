 public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        int t = 0;
        while(l1 != null || l2 != null || t != 0)
        {
            if(l1 != null) t += l1.val;
            if(l2 != null) t+= l2.val;
            p.next = new ListNode(t % 10);
            p = p.next;
            t /= 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
