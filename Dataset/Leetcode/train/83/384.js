var XXX = function(head) {
    let res = head
    let temp 
    let tempNode
    while(head) {
        if (head.next && head.next.val === head.val) {
            temp = head.val
            tempNode = head
            while(tempNode && tempNode.val === temp) {
                tempNode = tempNode.next
            }
            head.next = tempNode
        }
        head = head.next
    }
    return res
};

