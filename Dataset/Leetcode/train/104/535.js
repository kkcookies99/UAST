var XXX = function(root) {
    if(!root) return 0;
    return Math.max(XXX(root.left), XXX(root.right)) + 1;
};

