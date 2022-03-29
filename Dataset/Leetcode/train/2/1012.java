 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        int sum=0;
        ListNode dummy=new ListNode();
        ListNode pre=dummy;
        //注意即使链表l1和l2全完了，但sum!=0还需要再进位
        while(l1!=null || l2!=null || sum!=0){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            ListNode t=new ListNode(sum%10);
            pre.next=t;
            pre=t;
            sum=sum/10;
        }
        return dummy.next;
    }
}

