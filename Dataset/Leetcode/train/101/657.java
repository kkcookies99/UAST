 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root, root);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return (left == null) && (right == null);
        }
        boolean res = (left.val == right.val);
        return res && helper(left.left, right.right) && helper(left.right, right.left); 
    }
}

