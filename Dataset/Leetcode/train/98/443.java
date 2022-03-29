 class Solution {
    
    private Integer last = null;

    public boolean XXX(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode node) {
        if (node == null) {
            return true;
        }

        if (!dfs(node.left)) {
            return false;
        }

        if (last != null && last >= node.val) {
            return false;
        }
        last = node.val;

        return dfs(node.right);
    }
}

