public ListNode XXX(ListNode l1, ListNode l2) {
        return XXX(l1, l2, 0);
    }
    private ListNode XXX(ListNode l1, ListNode l2, int a) {
        if(l1 == null && l2 == null) return a == 0 ? null : new ListNode(a);
        if(l1 == null){
            l2.val += a;
            return new ListNode(l2.val % 10, XXX(null, l2.next, l2.val /10));
        }
        if(l2 == null) {
            l1.val += a;
            return new ListNode(l1.val % 10, XXX(null, l1.next, l1.val /10));
        }
        int sum = l1.val + l2.val + a;
        return new ListNode(sum % 10, XXX(l1.next, l2.next, sum / 10));
    }

