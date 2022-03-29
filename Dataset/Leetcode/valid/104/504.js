var XXX = function(root) {
    return root == null ? 0 : Math.max(XXX(root.left),XXX(root.right)) + 1
};

