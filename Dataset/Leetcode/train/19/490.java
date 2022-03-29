 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        while(n!=0){
            fast=fast.next;
            n--;
        }
        if(fast==null){    
            return head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

