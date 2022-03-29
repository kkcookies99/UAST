class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root)[0] == 1;
    }
    
    public int[] dfs(TreeNode root) {
        if (root == null) return new int[]{1, 0, 0};
        int[] res = new int[]{1, 0, 0};
        if (root.left != null) {
            int[] t = dfs(root.left);
            if (t[0] == 0 || Math.abs(t[1] - t[2]) > 1) res[0] = 0;
            res[1] = Math.max(t[1], t[2]) + 1;
        }
        if (root.right != null) {
            int[] t = dfs(root.right);
            if (t[0] == 0 || Math.abs(t[1] - t[2]) > 1) res[0] = 0;
            res[2] = Math.max(t[1], t[2]) + 1;
        }
        if (Math.abs(res[1] - res[2]) > 1) res[0] = 0;
        return res;
    }
}

