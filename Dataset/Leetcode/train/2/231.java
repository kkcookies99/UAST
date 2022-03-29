class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {

        int accumulate=0;

        ListNode p1=l1,p2=l2,dummy=new ListNode(-1),ret=dummy;

        while(p1!=null&&p2!=null){

            int num1=p1.val;
            int num2=p2.val;
            
           int  current=accumulate+num1+num2;
            dummy.next=new ListNode(current%10);
            dummy=dummy.next;
            accumulate=current/10;
            p1=p1.next;
            p2=p2.next;
        }
        while(p1!=null){

            int current=p1.val+accumulate;
            dummy.next=new ListNode(current%10);
            dummy=dummy.next;
            accumulate=current/10;
            p1=p1.next;

        }
        while(p2!=null){
            int current=p2.val+accumulate;
            dummy.next=new ListNode(current%10);
            dummy=dummy.next;
            accumulate=current/10;
            p2=p2.next;
        }
        if(accumulate!=0){
            dummy.next=new ListNode(accumulate);
            accumulate=0;
        }

        return ret.next;

    }
}

