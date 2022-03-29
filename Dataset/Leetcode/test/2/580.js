 var XXX = function(l1, l2) {

    let listNode1 = l1;
    let listNode2 = l2;
    let res = new ListNode(0);
    let curr = res;
    let carry = 0;
    
    while(listNode1 !== null || listNode2 !== null) {
        
        let total = (listNode1 == null ? 0 : listNode1.val) + (listNode2 == null ? 0 : listNode2.val) + carry;
        carry = parseInt(total / 10);
        curr.next =  new ListNode(total % 10);
        curr = curr.next;
        
        if (listNode1 != null) listNode1 = listNode1.next;
        if (listNode2 != null) listNode2 = listNode2.next;
    };
    
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    
    return res.next;
};



