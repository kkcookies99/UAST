 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode a=head;
        ListNode b=head;
        for(int i=0;i<n;i++)
            b=b.next;
        if(b==null)
            return head.next;
        while(b.next!=null){
            a=a.next;
            b=b.next;
        }
        ListNode temp=a.next;
        a.next=temp.next;
        return head;
    }
}

