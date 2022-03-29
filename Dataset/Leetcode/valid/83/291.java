public ListNode XXX(ListNode head) {
    if(head == null) return null;
    ListNode res = head;
    ListNode temp = res;
    while(head != null) {
        if(temp.val != head.val) {
            temp.next = head;
            temp = temp.next;
        }
        head = head.next;
    }
    temp.next = null;
    return res;
}

