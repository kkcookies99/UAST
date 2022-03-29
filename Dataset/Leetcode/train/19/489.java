 public ListNode XXX(ListNode head, int n) {
       ListNode dummy = new ListNode(0,head);
       ListNode first = dummy;
       ListNode second = dummy;
        while(first !=null){
            if(n >=0){

                first = first.next;
                n--;

            }else{
                second = second.next;
                first = first.next;
            }
        } 
        second.next= second.next.next;

        return dummy.next;  

    }

