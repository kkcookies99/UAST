class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null) return null;
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(pre.val==cur.val){
                pre.next=cur.next;
                cur=cur.next;
                continue;
            }
            pre=cur;
            cur=cur.next;
        }
        return head;
    }
}

