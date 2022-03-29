 var XXX = function(root) {
    const result = []
    const stack = []
    let current = root
    while (stack.length || current) {
        while (current) {
            stack.unshift(current)
            current = current.left
        }
        current = stack.shift()
        result.push(current.val)
        current = current.right
    }
    return result
};

