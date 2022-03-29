 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return t1.val == t2.val && dfs(t1.left, t2.right) && dfs(t1.right, t2.left);
    }
}

