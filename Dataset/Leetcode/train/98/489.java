 class Solution {
    private long tmp = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) return true;
        boolean left = dfs(root.left);
        boolean mid = root.val > tmp;
        if (!mid) {
            return false;
        }
        tmp = root.val;
        boolean right = dfs(root.right);
        return left && right;
    }
}

