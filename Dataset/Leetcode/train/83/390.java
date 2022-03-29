class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curNode = head;
        while (curNode.next != null) {
            if (curNode.val == curNode.next.val) {
                // 删除next节点
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return head;
    }
}

