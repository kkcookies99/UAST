public ListNode XXX(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode p,e;
        p=head;
        while ((e=p.next)!=null) {
            if (p.val==e.val) {
                p.next=e.next;
                continue;
            }
            p=e;
        }
        return head;
    }

