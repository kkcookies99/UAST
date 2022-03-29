 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (n < 0) {
                slow = slow.next;
            }
            fast = fast.next;
            n--;
        }
        if (n == 0) { //删除头结点
            return slow.next;
        } else {
            slow.next = slow.next.next;
        }
        return head;
    }
}

