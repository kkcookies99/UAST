class Solution {
    public ListNode XXX(ListNode head) {
        ListNode p =head;
        while(p!=null)
        {
            ListNode t  =p.next;
            while(t!=null)
            {
                 if(t.val!=p.val)
                 break;
                 t=t.next;
            }
            p.next=t;
            p=p.next;
        }
        return head;
    }
}

