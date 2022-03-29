 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head.next==null&&n==1){
            return null;
        }
        ListNode front=head;
        ListNode pre=head;
        ListNode after=front;
        while (n!=0){
            after=after.next;
            --n;
        }
        while (after!=null){
            pre=front;
            front=front.next;
            after=after.next;
        }
        if(front==head){
            head=head.next;
        }
        else pre.next=front.next;
        return head;
    }
}

