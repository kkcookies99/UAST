class Solution {
    public ListNode XXX(ListNode head) {
        if(head==null)
        return head;
        ListNode pre=head;
        while(pre.next!=null)
        {
           if(pre.val==pre.next.val)
           pre.next=pre.next.next;
           else
               pre=pre.next;
        }
        return head;
    }
}

