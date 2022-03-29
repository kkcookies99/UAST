 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode slow, fast;
        ListNode dummy = new ListNode(-1, head);
        slow = dummy;
        fast = dummy;
        while(fast.next != null){
            if(--n < 0){ // 等 n 下再走
                slow = slow.next;
            }
            fast = fast.next;
        }
        // slow 最多去到倒数第二个上面
        slow.next = slow.next.next;
        return dummy.next;
    }
}

