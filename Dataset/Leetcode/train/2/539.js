 var XXX = function(l1, l2) {
    let sum, temp = 0
    const result = new ListNode()
    node = result
    do {
        sum = (l1 && l1.val || 0) + (l2 && l2.val || 0) + temp
        temp = parseInt(sum / 10)
        node.val = sum % 10
        
        l1 = l1 && l1.next
        l2 = l2 && l2.next
    } while (node = node.next = l1 || l2 || temp && new ListNode())
    return result
};

