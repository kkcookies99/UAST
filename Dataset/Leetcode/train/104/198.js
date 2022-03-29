var XXX = function(root) {
    if(!root) return 0 
    return 1 + Math.max(XXX(root.left), XXX(root.right))

};
