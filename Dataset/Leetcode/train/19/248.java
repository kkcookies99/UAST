 class Solution {
    public ListNode XXX(ListNode head, int n) {
        int len=0;
        ListNode q=head;
        while(q!=null){
            len++;
            q=q.next;
        }
        len-=n;
        ListNode newhead=new ListNode(-1);
        newhead.next=head;
        q=newhead;
        while(len-->0){
            q=q.next;
        }
        q.next=q.next.next;
        return newhead.next;
    }
}

