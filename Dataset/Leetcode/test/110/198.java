class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        try {
            dfs(root);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public int dfs(TreeNode root) throws Exception{
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1) {
            throw new Exception();
        }
        //更新当前
        return Math.max(left, right) + 1;
    }
}

