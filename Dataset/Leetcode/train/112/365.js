 var XXX = function(root, targetSum) {
    return func(root, 0, targetSum);
};

var func = function(node, sum, targetSum) {
    if (!node) {
        return false;
    }

    var current = node.val + sum;
    
    if (!node.left && !node.right) {
        return current == targetSum;
    }
    
    return func(node.left, current, targetSum) || func(node.right, current, targetSum);
};

