 class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null) return null;
        ListNode list=new ListNode(head.val);
        ListNode pre=list;
        for(;head.next!=null;head=head.next){
            if(head.next.val!=head.val){
                pre.next=new ListNode(head.next.val);
                pre=pre.next;
            }
        }
        return list;
    }
}

