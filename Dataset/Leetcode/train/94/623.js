 var XXX = function(root) {
    const res = []
    dfs(root, res)
    return res
};

var dfs = (root, res) => {
    if (!root) return
    dfs(root.left, res)
    res.push(root.val)
    dfs(root.right, res)
}

