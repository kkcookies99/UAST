 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null)
            return true;
        return is(root.left, root.right);
    }

    private boolean is(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        return left.val == right.val && is(left.left, right.right) && is(left.right, right.left);
    }
}

