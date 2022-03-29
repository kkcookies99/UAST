 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null)
            return null;
        ListNode first=head;
        ListNode second=head;
        for(int i=0;i<n;i++)
            first = first.next;
        while(first!=null && first.next!=null){
            first=first.next;
            second=second.next;
        }
        if(first==null && second==head){//需要删除的是头结点
            return head.next;
        }
        second.next=second.next.next;
        return head;
    }
}

