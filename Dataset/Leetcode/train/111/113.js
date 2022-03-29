var XXX = function(root) {
    return root ? 1 + (!root.left && !root.right ? 0 : (root.left && root.right ? Math.min(XXX(root.left), XXX(root.right)) : Math.max(XXX(root.left), XXX(root.right)))): 0;
};

