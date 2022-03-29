 public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
            int code = 0;
            ListNode l3 = result;
            while(l1!=null||l2!=null||code!=0){
                int x1 = l1==null? 0:l1.val;
                int x2 = l2==null? 0:l2.val;
                l3.next = new ListNode((x1+x2+code)%10);
                code = x1+x2+code>9? 1:0;
                if(l1!=null)l1=l1.next;
                if(l2!=null)l2=l2.next;
                l3=l3.next;
            }
            return result.next;
    }

