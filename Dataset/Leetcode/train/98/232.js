 var XXX = function(root) {
    if (!root) {
        return true;
    }
    var valid = true;

    var walkTree = (node, min, max) => {
        if (!node) {
            return;
        }
        if (min !== null && node.val <= min) {
            valid = false;
        }
        if (max !== null && node.val >= max) {
            valid = false;
        }
        if (!valid) {
            return;
        }
        walkTree(node.left, min, node.val);
        walkTree(node.right, node.val, max);
    };

    walkTree(root, null, null);

    return valid;
};

