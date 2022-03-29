var XXX = function(root) {
    if(!root) return 0
    if(!root.left && !root.right) return 1
    return Math.max(XXX(root.left), XXX(root.right)) + 1
};

