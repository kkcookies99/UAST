 class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode root, long low, long high) {
        if (root==null) return true;
        if(root.val<=low||root.val>=high) return false;
        return dfs(root.left, low, root.val) && dfs(root.right, root.val, high);
    }
}

