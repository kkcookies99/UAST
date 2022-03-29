 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        } else if(left == null || right == null){
            return false;
        }
        if(left.val == right.val) {
            return dfs(left.left, right.right) && dfs(left.right, right.left);
        }

        return false;
    }
}

