  public ListNode XXX(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre=head;
        while(head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return pre;    
    }

