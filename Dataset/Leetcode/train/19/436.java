 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if(head==null) return head;
        if(find(head,n)==n) return head.next;
        return head;
    }

    private int find(ListNode head,int n){
        if(head==null) return 0;
        else{
            int pos=find(head.next,n)+1;
            if(pos==n+1) head.next=head.next.next;
            return pos;
        }
    }
}

