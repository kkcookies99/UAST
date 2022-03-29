 class Solution {
    public boolean XXX(TreeNode root) {
        return recursion(Long.MIN_VALUE, Long.MAX_VALUE,root);
    }

    public boolean recursion(long min, long max, TreeNode root) {
        if (root == null) {
            return true;
        }
        // 判断左子树
        if (root.left != null && (root.left.val <= min || root.left.val >= root.val)) {
            return false;
        }
        // 递归左子树 只修改最大值
        boolean leftResult = recursion(min,root.val,root.left);
        if (!leftResult) {
            return false;
        }
        // 判断右子树
        if (root.right != null && (root.right.val >= max || root.right.val <= root.val)) {
            return false;
        }
        return recursion(root.val,max,root.right);
    }
}

