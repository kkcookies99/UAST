 class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode res = node;
        int after = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int num = a + b + after;
            after = num / 10 == 1 ? 1 : 0;
            node.next = new ListNode(num % 10);
            node = node.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (after == 1) {
            node.next = new ListNode(1);
        }
        return res.next;
    }
}

