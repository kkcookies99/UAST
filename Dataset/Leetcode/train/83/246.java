public ListNode XXX(ListNode head) {
    if (head == null) {
        return null;
    }
    if (head.next == null) {
        return head;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (fast != null) {
        if (slow.val != fast.val) {
            slow.next = fast;
            slow = fast;
        }
        fast = fast.next;
    }
    //断尾,砍掉slow之后的节点
    slow.next = null;
    return head;
}

