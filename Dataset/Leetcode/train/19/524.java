 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode l=head;
        ListNode r=head;
        ListNode pre=l;
        for(int i=1;i<n;i++){//相隔n-1
            r=r.next;
        }
        if(r.next==null){//等于说，倒n就是第一个
            return head.next;
        }
        while(r.next!=null){
            pre=l;
            l=l.next;
            r=r.next;
        }
        pre.next=l.next;
        return head;
    }
}

