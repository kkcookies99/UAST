 var XXX = function(l1, l2) {
    let add2next = 0,
        retNode = new ListNode('null'),
        retHead = retNode
    
    const calculateNode = (...arg) => {
        return arg.reduce((total, cur) => {
            return total + cur.val
        }, 0)
    }
    
    const travelNodeAndCalculate = (...nodes) => {
        let result = calculateNode(...nodes) + add2next
        add2next = 0 
        if (result >= 10) {
            add2next = 1
            result %= 10
        }

        retHead.next = new ListNode(result)
        retHead = retHead.next
        
        return nodes.map(node => node.next)
    }
    
    while (l1 && l2)    [l1, l2] = travelNodeAndCalculate(l1, l2)
    while (l1)  [l1] = travelNodeAndCalculate(l1)
    while (l2)  [l2] = travelNodeAndCalculate(l2)
    if (add2next)   retHead.next = new ListNode(add2next)
    
    return retNode.next
};

