var XXX = function(root) {
    if (!root) return true
    let isB = Math.abs(dfs(root.left, 0) - dfs(root.right, 0)) <= 1
    if (!isB) return isB
    return XXX(root.left) && XXX(root.right)
};

var dfs = (root, level) => {
    if (!root) return level
    return Math.max(dfs(root.left, level + 1), dfs(root.right, level + 1))
}

