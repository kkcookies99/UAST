 class Solution {
    public ListNode XXX(ListNode head) {
        ListNode p=head,q=p;
        while(p!=null)
        {
            q=p.next;
            if(q==null)break;
            
            while(p.val==q.val)
            {
                p.next=q.next;
                if(q.next==null)break;
                q=q.next;
            }
            
            p=p.next;
        }
        
        return head;
    }
}

