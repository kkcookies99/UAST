 var XXX = function(root) {
    const result = []
    const recursion = root => {
        if (!root) return
        recursion(root.left)
        result.push(root.val)
        recursion(root.right)
    }
    recursion(root)
    return result
};

