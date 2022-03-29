class Solution {
    public ListNode XXX(ListNode head) {
        ListNode nowNode = head;
        ListNode nextNode = head != null ? head.next : null;
        while (nextNode != null) {
            if (nowNode.val == nextNode.val) {
                nowNode.next = nextNode.next;
            } else {
                nowNode = nextNode;
            }
            nextNode = nowNode.next;
        }
        return head;
    }
}

