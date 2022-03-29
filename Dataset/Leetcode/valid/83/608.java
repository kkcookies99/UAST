 public ListNode XXX(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = head;
        while(p != null && p.next != null){
            if(p.val == p.next.val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return head;
    }
     
}

