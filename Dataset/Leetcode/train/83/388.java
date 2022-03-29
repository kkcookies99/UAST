class Solution {
    public ListNode XXX(ListNode head) {
        ListNode p1=head,p2=head;
        while(p1!=null){
            p2=p1.next;
            if(p2!=null&&p1.val==p2.val){
                p1.next=p2.next;
                continue;
            }
            p1=p1.next;
        }
        return head;
    }
}

