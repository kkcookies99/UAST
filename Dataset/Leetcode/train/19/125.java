 public ListNode XXX(ListNode head, int n) {
    ListNode fast = head;
    ListNode slow = head;
    int i = 0;
    while (fast.next != null) {
        if (++i > n) {
            slow = slow.next;
        }
        fast = fast.next;
    }
    if (i == (n - 1)) { // 处理删除头结点的情况
        return head.next;
    }
    slow.next = slow.next.next;
    return head;
}

