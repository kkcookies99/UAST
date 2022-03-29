class Solution {
    public boolean XXX(TreeNode root) {
        return isBT(root);
    }

    private boolean isBT(TreeNode node) {
        // 递归终止条件
        if (node == null) return true;

        boolean leftIsBT = isBT(node.left);
        boolean rightIsBT = isBT(node.right);

        // 当左子树不平衡或者右子树不平衡或者左右子树高度差大于1时，返回 false 
        if (!leftIsBT || !rightIsBT || Math.abs(depth(node.left) - depth(node.right)) > 1) {
            return false;
        }
        
        return true;
    }

    private int depth(TreeNode node) {
        return node == null ? 0 : Math.max(depth(node.left), depth(node.right)) + 1;
    }
}

