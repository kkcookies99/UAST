var XXX = function(root) {
    if(!root) return 0;
    let maxLength = 0;
    const dfs = (node, length) => {
        if(node.left) {
            dfs(node.left, length + 1)
        }
        if(node.right) {
            dfs(node.right, length + 1)
        }
        maxLength = Math.max(maxLength, length)
    }
    dfs(root, 1);
    return maxLength;
};

