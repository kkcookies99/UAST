 class Solution {
    public boolean XXX(TreeNode root) {
        return XXX(root, null, null);
    }

    private boolean XXX(TreeNode root, TreeNode lower, TreeNode higher) {
        // 如果能走到叶子节点说明还未发现不符合 BST 特征的子树
        if (root == null) return true;

        // 前序遍历代码
        // 当递归进入右子树时判断，如果右子树的节点比根节点还要小，那就不符合 BST 了
        if (lower != null && root.val <= lower.val) return false;
        // 当递归进入左子树时判断，如果左子树的节点比根节点还要大，那就不符合 BST 了
        if (higher != null && root.val >= higher.val) return false;

        return XXX(root.left, lower, root) && XXX(root.right, root, higher);
    }
}

