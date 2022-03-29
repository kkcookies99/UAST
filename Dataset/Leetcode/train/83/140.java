public ListNode XXX(ListNode head) {
     if(head==null||head.next==null){
        return head;
     }
     head.next=XXX(head.next);
     if(head.val==head.next.val){
        head=head.next;
     }
     return head;
   }

