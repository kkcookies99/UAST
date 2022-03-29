 public ListNode XXX(ListNode head) {
    if (head == null){
        return null;
    }
    
    ListNode node = head;
    
    while (node.next != null){
        if (node.val == node.next.val) {
            node.next = node.next.next;
        }else {
            node = node.next;
        }
    }
    
    return head;
}
