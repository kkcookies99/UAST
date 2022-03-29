 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode newhead=new ListNode(-1,head);
        ListNode slow=newhead;
        ListNode fast=head;
        while(n-->0){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return newhead.next;
    }
}

