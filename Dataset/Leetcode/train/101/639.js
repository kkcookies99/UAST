 var XXX = function(root) {
    const dfs = (left, right) => {
       return left && right && left.val === right.val && dfs(left.left, right.right) && dfs(left.right, right.left) || !left && !right
    }
    if (!root) return true
    return dfs(root.left, root.right)
};

