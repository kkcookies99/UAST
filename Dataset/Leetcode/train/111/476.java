class Solution {
    public int XXX(TreeNode root) {
        if (null == root) return 0;
        if (root.left == null && root.right == null) return 1;
        int ans = Integer.MAX_VALUE;
        if (root.left != null) ans = Math.min(ans, 1 + XXX(root.left));
        if (root.right != null) ans = Math.min(ans, 1 + XXX(root.right));
        return ans;
    }
}

