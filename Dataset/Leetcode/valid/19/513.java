     public ListNode XXX(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pre = dummy;
        ListNode fast = head;

        while(head != null){
            head = head.next;
            if(--n < 0){
                pre = pre.next;
            }
        }
        pre.next = pre.next.next;
        return dummy.next;
    }

