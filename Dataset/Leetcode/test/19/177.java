 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode p1 = head,p2=head;
        int len=0;
        while(p1!=null){
            p1=p1.next;
            len++;
        }
        if(len==n){
            head=head.next;
            return head;
        }
        int target = len-n;
        len=1;
        while(len<target){
            p2=p2.next;
            len++;
        }
        p2.next=p2.next.next;
        return head;
    }
}

