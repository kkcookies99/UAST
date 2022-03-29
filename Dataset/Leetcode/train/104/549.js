var XXX = function(root) {
    return !root ? 0 : Math.max(XXX(root.left), XXX(root.right)) + 1
}

