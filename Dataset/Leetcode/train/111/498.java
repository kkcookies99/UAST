class Solution {
    public int XXX(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }

        int i = dfs(root.left);
        int j = dfs(root.right);
        return 1 + Math.min(i, j);
    }
}

