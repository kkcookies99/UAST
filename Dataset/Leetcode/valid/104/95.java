class Solution {
    public int XXX(TreeNode root) {
        int depth = 1;
        if (root==null) {
            return 0;
        }
        return Math.max(depth + XXX(root.left), depth + XXX(root.right));
    }
}

