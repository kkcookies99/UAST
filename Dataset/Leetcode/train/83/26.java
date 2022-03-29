class Solution {
     public ListNode XXX(ListNode head) {
        ListNode node = new ListNode(-1);
        node.next = head;
        while (node != null) {
            ListNode next = node.next;
            if (next != null && next.val == node.val) {
                // 下一个指针指向
                node.next = next.next;
            } else {
                node = next;
            }
        }
        return head;
    }
}

