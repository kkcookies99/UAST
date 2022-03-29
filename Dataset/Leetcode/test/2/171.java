class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode cur=dummyHead;
        int plus=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+plus;
            cur.next=new ListNode(sum%10);
            plus=sum/10;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+plus;
            cur.next=new ListNode(sum%10);
            plus=sum/10;
            cur=cur.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+plus;
            cur.next=new ListNode(sum%10);
            plus=sum/10;
            cur=cur.next;
            l2=l2.next;
        }
        if(plus==1) cur.next=new ListNode(1);
        return dummyHead.next;
    }
}

