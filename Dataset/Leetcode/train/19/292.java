 public ListNode XXX(ListNode head, int n) {
    if (head == null || n < 1) {
        return head;
    }
    ListNode cur = head;
    while (cur != null) {
        n--;
        cur = cur.next;
    }
    if (n == 0) {
        head = head.next;
    }
    if (n < 0) {
        cur = head;
        while (++n != 0) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
    return head;
}
