 class Solution {
    private boolean ans = true;
    private TreeNode pre;
    
    public boolean XXX(TreeNode root) {
        dfs(root);
        return ans;
    }
    
    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (pre != null && node.val <= pre.val)
            ans = false;
        pre = node;
        dfs(node.right);
    }
}

