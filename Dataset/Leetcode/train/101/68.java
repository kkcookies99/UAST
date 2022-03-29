 class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root, root);
    }

    public boolean dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if(root1.val == root2.val){
            return dfs(root1.left, root2.right) && dfs(root1.right, root2.left);
        }
        return false;
    }
}

