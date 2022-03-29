 var XXX = function(root) {
    let ans = true
    function getDepth(node) {
        if (!node) return 0
        if (!ans) return
        const left = getDepth(node.left)
        const right = getDepth(node.right)
        if (Math.abs(left - right) > 1) ans = false
        return Math.max(left, right) + 1
    }
    getDepth(root)
    return ans
};

