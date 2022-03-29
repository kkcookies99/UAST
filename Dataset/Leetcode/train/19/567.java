 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode newHead=new ListNode(0,head);
        ListNode slow=newHead;
        ListNode fast=newHead;
        while(fast.next!=null){
            fast=fast.next;
            if(n>0){
                n--;
            }else{
                slow=slow.next;
            }
        }
        slow.next=slow.next.next;
        return newHead.next;
    }
}

