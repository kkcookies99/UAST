var XXX = function(root, targetSum) {
    if (root === null) {
        return false
    }
    // 深度优先遍历，找到叶子节点
    if (root.left === null && root.right === null) {
        return targetSum === root.val
    }
    // 有一侧节点满足就可以
    return XXX(root.left, targetSum - root.val) || XXX(root.right, targetSum - root.val)
};

