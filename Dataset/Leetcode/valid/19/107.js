 var XXX = function(head, n) {
    let dummy = new ListNode(0);
    dummy.next = head;
    let length  = 0;
    let first = head;
    while (first != null) {
        length++;
        first = first.next;
    }
    length -= n;
    first = dummy;
    while (length > 0) {
        length--;
        first = first.next;
        console.log('first', first)
        console.log('dummy', dummy)
    }
    first.next = first.next.next;
    console.log('first1', first)
    console.log('dummy1', dummy)
    return dummy.next;
};

