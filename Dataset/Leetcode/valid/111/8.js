var XXX = function(root) {
    if(!root) return 0;
    let leftDepth = XXX(root.left);
    let rightDepth = XXX(root.right);
    return (leftDepth && rightDepth) ? Math.min(leftDepth, rightDepth) + 1 : leftDepth + rightDepth + 1;
};

