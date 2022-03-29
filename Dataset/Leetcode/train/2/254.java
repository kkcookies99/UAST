class Solution {
        public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        ListNode m = l1;
        ListNode n = l2;
        int carried = 0;
        while (m != null || n != null) {
            int x = 0;
            int y = 0;
            if (m != null) {
                x = m.val;
                m = m.next;
            }
            if (n != null) {
                y = n.val;
                n = n.next;
            }
            int sum = x + y + carried;
            carried = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        // 不要忘记最后的进位
        if (carried > 0) {
            current.next = new ListNode(carried);
        }
        return head.next;
    }
}

