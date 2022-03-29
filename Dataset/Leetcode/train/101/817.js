 var XXX = function(root) {
    if (!root) return true
    function dfs(n1, n2) {
        if (!n1 && !n2) return true
        if (!n1 || !n2) return false
        return n1.val === n2.val && dfs(n1.left, n2.right) && dfs(n1.right, n2.left)
    }
    return dfs(root.left, root.right)
};

