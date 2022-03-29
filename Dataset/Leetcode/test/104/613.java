 class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int leftDepth = 1 + XXX(root.left);
        int rightDepth = 1 + XXX(root.right);
        return Math.max(leftDepth, rightDepth);
    }
}

