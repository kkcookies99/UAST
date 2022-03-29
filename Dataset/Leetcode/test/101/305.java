 class Solution {
    public boolean XXX(TreeNode root) {
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left != null && right != null && left.val == right.val) 
            return dfs(left.right, right.left) && dfs(left.left, right.right);
        return false;     
    }
}

