    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode add = addByRecursion(l1, l2, 0);
        return add;
    }

    public ListNode addByRecursion(ListNode l1,ListNode l2,int initialValue){
        int valueL1=l1!=null?l1.val:0;
        int valueL2=l2!=null?l2.val:0;
        int sum=valueL1+valueL2+initialValue;
        ListNode last=new ListNode(sum%10);
        if((l1!=null&&l1.next!=null)||(l2!=null&&l2.next!=null)||sum>=10){
            ListNode add = addByRecursion(l1!=null?l1.next:null, l2!=null?l2.next:null,sum>=10?sum/10:0);
            last.next=add;
        }
        return last;
    }

