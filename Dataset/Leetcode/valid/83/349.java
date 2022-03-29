public ListNode XXX(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }
    ListNode result = new ListNode();
    ListNode current = result;
    while(head != null) {
        while(head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        current.next = head;
        current = current.next;
        head = head.next;
    }
    return result.next;
}
