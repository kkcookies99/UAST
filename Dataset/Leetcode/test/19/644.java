 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        ListNode pre = dummy;
        while(fast!=null){
            pre = pre.next;
            fast = fast.next;
        }
        pre.next = pre.next.next;
        return dummy.next;
    }
}

