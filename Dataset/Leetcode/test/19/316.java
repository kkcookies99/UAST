 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode front=head, back=head, pre = dummy;
        // 双指针定位LAST N
        while ( n-- != 0 ) {
            front = front.next;
        }
        while ( front != null ) {
            front = front.next;
            pre = back;         // 维护一个前驱节点
            back = back.next;
        }
        pre.next = back.next;   // “删除”
        return dummy.next;
    }
}  

