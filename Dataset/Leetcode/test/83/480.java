 class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ret = XXX(head.next);
        head.next = (ret.val == head.val) ? ret.next : ret;
        return head;
    }
}

