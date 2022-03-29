     public ListNode XXX(ListNode head, int n) {
        if (head == null) return null;
        int i = 1, j = 1, k = 0;
        ListNode p = head, q = head, r = q;
        while (p.next != null) {
            if (i >= n) {
                r = q;
                q = q.next;
                j++;
            }
            p = p.next;
            i++;
        }
        
        if (r != q)
            r.next = r.next.next;
        else head = head.next;

        return head;
    }

