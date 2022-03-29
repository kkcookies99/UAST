var XXX = function(root) {
    if (root == null) return true;
    let ans = true;
    function calcHeight(node) {
        if (node == null) return 0;

        let leftHeight = calcHeight(node.left);
        let rightHeight = calcHeight(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            ans = false;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    calcHeight(root);

    return ans;
};

