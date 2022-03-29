var XXX = function(root) {
    if (!root) {
        return 0;
    }
    return level(root, 1);
};

var level = function(node, n) { 
    if (!node) {
        return n;
    }
    
    var left = n;
    var right = n;
    if (node.left) {
        left = level(node.left, n+1);
    }

    if (node.right) {
        right = level(node.right, n+1);
    }
    return Math.max(left, right);
}


