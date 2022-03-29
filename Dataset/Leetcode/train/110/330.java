class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.abs(leftDepth - rightDepth) <= 1 && XXX(root.left) && XXX(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}

