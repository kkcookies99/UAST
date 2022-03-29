 var XXX = function(root) {
    let stack = [root]
    while (stack.length) {
        let tmp = []
        for (let i = 0; i < stack.length; i++) {
            const left = stack[i]
            const right = stack[stack.length - i -1]
            if (left && right) {
                if (left.val !== right.val) {
                    return false
                }
                tmp.push(left.left, left.right)
            } else if (left && !right || !left && right) {
                return false
            }
        }
        stack = tmp
    }
    return true
};

