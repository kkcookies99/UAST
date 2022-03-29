 class Solution {
    public ListNode XXX(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        // 双指针 
        ListNode slowNode = head;
        ListNode fastNode = head;
        for (int i = 0; i < n - 1; i++) {
            fastNode = fastNode.next;
        }
        ListNode preNode = null;
        while (fastNode.next != null) {
            // 这里记录上个节点，用于处理n=1空指针的情况 
            preNode = slowNode;
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        if (slowNode.next == null) {
            preNode.next = null;
        } else {
            slowNode.val = slowNode.next.val;
            slowNode.next = slowNode.next.next;
        }
        return head;
    }
}

