 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode head1=new ListNode();
        head1.next=head;
        ListNode h1=head1;
        ListNode h=head1;
        for(int i=0;i<n+1;i++){
            h=h.next;
        }
        while(h!=null){
            h1=h1.next;
            h=h.next;
        }
        ListNode temp=h1.next!=null ? h1.next.next:null;
        if(h1.next!=null){
            h1.next.next=null;
        }
        h1.next=temp;
        return head1.next;
    }
}

