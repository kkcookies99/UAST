var XXX = function(root) {
    function getNodeHeight(node) {
        if (!node) return 0;
        return Math.max(getNodeHeight(node.left), getNodeHeight(node.right)) + 1;
    }
    function dfs(node) {
        if (!node) return true;
        if (Math.abs(getNodeHeight(node.right) - getNodeHeight(node.left)) > 1) return false;
        return dfs(node.left) && dfs(node.right);
    }
    return dfs(root);
};

