var XXX = function(root) {
    if(root === null)
        return 0;
    var left = XXX(root.left) + 1;
    var right = XXX(root.right) + 1;
    return left > right ? left : right;
};

