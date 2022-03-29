 class Solution {
    public ListNode XXX(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        removeNode(dummy,n + 1);  // 找到倒数第n + 1个节点
        return dummy.next;
    }

    private int removeNode(ListNode head, int n) {
        if(head == null)
            return 0;
        int count = removeNode(head.next,n) + 1;
        if(count == n)
            head.next = head.next.next;
        return count;
    }
}

