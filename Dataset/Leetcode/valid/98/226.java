 class Solution {
    boolean flag = true;
    long prev = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        dfs(root);
        return flag;        
    }
    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (root.val <= prev) {
            flag = false;
            return;
        }
        prev = root.val;
        dfs(root.right);
    }
}

