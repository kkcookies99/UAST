 var XXX = function(head, n) {
    let stack = []
    let start = head
    while(start) {
        stack.push(start)
        start = start.next
    }
    stack.splice(stack.length - n, 1)
    if (stack.length === 0) {
        return null
    }
    else if (stack.length === 1) {
        stack[0].next = null
        return stack[0]
    }
    for (let i = 0; i < stack.length - 1; i++) {
        stack[i].next = stack[i + 1]
    }
    stack[stack.length - 1].next = null
    return stack[0]
};

