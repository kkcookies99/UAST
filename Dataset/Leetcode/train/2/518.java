 public ListNode XXX(ListNode l1, ListNode l2) {
    ListNode head = new ListNode();
    ListNode tail = head;
    int carry = 0;
    while (l1!=null||l2!=null){
        ListNode listNode1 = new ListNode(carry);
        if(l1!=null){
            listNode1.val += l1.val;
            l1 = l1.next;
        }
        if(l2!=null){
            listNode1.val += l2.val;
            l2 = l2.next;
        }
        carry = listNode1.val/10;
        if(carry>0){
            listNode1.val%=10;
        }
        tail.next = listNode1;
        tail = tail.next;
    }
    if(carry==1) {
        tail.next = new ListNode();
        tail.next.val = 1;
    }
    return head.next;
}
