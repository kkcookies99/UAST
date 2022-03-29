class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        return dfs(root);
    }

    int dfs(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null) return 1;

        return Math.min(dfs(root.left),dfs(root.right)) + 1;
    }
}

