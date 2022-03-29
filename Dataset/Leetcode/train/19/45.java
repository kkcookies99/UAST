 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode rec=new ListNode(0);
        rec.next=head;
        ListNode p=rec;
        ListNode q=head;
        for(int i=1;i<=n;i++){
            q=q.next;
        }
        while(q!=null){
            p=p.next;
            q=q.next;
        }
        p.next=p.next.next;
        return rec.next;
    }
}

