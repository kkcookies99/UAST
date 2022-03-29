 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return XXX(root.left, root.right);
    }

    private boolean XXX(TreeNode left, TreeNode right) {
        if (left != null && right != null && left.val == right.val) {
            return XXX(left.left, right.right) && XXX(left.right, right.left);
        }
        return left == null && right == null;
    }
}

