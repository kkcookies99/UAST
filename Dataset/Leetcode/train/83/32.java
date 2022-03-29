class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode p=head,q=head.next;
        while(q!=null){
            if(p.val==q.val){
                q=q.next;
            }else{
                p.next=q;
                p=q;
                q=q.next;
            }
        }
        p.next=q;
        return head;
    }
}

