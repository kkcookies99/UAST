var XXX = function(root) {
    if (!root) {
        return 0;
    }
    if (root.left && root.right) {
        return Math.max(XXX(root.left) + 1, XXX(root.right) + 1);
    }
    if (root.left) {
        return XXX(root.left) + 1;
    }
    if (root.right) {
        return XXX(root.right) + 1;
    }
    return 1;
};

