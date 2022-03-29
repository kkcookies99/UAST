 var XXX = function(l1, l2) {
    let result = new ListNode(0) 
    let nowNode = result
    let carry = 0
    while (l1 || l2 || carry) {
        let sum = (l1?.val || 0) + (l2?.val || 0) + carry
        nowNode = nowNode.next = new ListNode(sum % 10)
        carry = parseInt(sum / 10)
        if (l1) l1 = l1.next
        if (l2) l2 = l2.next
    } 
    return result.next
};

