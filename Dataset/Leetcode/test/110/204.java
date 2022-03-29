public boolean XXX(TreeNode root) {
    return height(root, 1) >= 0;
}

/**
 * @return 返回root节点最大子树长度
 * ll rl 都返回-1 也不会影响
 * 缺点：没有减枝
 */
public int height(TreeNode root, int level) {
    if (root == null) return level - 1;
    // 获取左子树最大长度
    int ll = height(root.left, level + 1);
    // 获取右子树最大长度
    int rl = height(root.right, level + 1);
    // 如果左右子树长度不超过1，说明满足平衡二叉树，即返回子树最大长度，否则返回-1
    return Math.abs(ll - rl) <= 1 ? Math.max(ll, rl) : -1;
}

