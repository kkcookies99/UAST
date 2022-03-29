    public ListNode XXX(ListNode l1, ListNode l2) { 
        return add(l1,l2,0);
    }
    public ListNode add(ListNode l1, ListNode l2,int z) {
        if(l1==null&&l2==null&&z==0){
            return null;
        }
        if(l1==null){
            l1=new ListNode(0);
        }
        if(l2==null){
            l2=new ListNode(0);
        }
        int value=l1.val+l2.val+z;
        ListNode result=new ListNode(value%10);
        result.next=add(l1.next, l2.next,value/10);
        return result;
    }

