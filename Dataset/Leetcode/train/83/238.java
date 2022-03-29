class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(0);
        ListNode res = node, pre = null;
        while (head != null) {
            ListNode temp = head.next;
            if (pre == null || head.val != pre.val) {
                node.next = head;
                node = node.next;
                node.next = null;
            }
            pre = head;
            head = temp;
        }
        return res.next;
    }
}

