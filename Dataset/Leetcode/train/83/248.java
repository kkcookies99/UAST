class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null)
        return null;
        if(head.next==null)
        return head;
        ListNode cur=head.next;
        ListNode pre=head;
        while(cur!=null)
        {
            if(cur.val==pre.val)
            {
                pre.next=cur.next;
                cur=cur.next;
            }
            else
            {
                pre=cur;
                cur=cur.next;
            }
        }
        return head;
    }
}

