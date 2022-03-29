 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode realHead = new ListNode(0,head);
        ListNode slow = realHead;
        ListNode fast = realHead;
        int flag = -1;
        while(fast!=null){
            if(flag!=n)
            {
                flag++;
                fast = fast.next;
                continue;
            }
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return realHead.next;

    }
}

