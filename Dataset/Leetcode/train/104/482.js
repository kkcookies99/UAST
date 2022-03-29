var XXX = function(root) {
    if(!root) {
        return 0
    }
    const left = XXX(root.left)
    const right = XXX(root.right)
    return Math.max( left, right ) + 1
};

