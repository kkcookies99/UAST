 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode header = new ListNode(-1);
        header.next=head;
        ListNode  p = header;
        ListNode  q = header;
        for(int i = 0; i < n; i++)
        {
            p=p.next;
        }
        while(p.next!=null)
        {
            q=q.next;
            p=p.next;
        }
        q.next = q.next.next ;
        return header.next;
    }
}

