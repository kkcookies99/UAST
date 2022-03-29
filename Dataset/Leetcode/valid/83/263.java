class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode currentNode = head.next;
        ListNode preNode = head;
        while (currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            if (currentNode.val == preNode.val) {
                preNode.next  = currentNode.next;
            } else {
                preNode = currentNode;
            }
            currentNode = nextNode;
        }
        if (preNode.val == currentNode.val) {
            preNode.next = null;
        }
        return head;
    }
}

