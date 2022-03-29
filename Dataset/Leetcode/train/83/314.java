class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode left = head;
        ListNode right = head.next;
        ListNode re = left;
        while (right != null) {
            if (left.val != right.val) {
                left.next = right;
                left = right;
            }
            right = right.next;
        }
        left.next = null;
        return re;
    }
}

