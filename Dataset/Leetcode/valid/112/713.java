 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if(root == null) return false;
        return dfs(root, sum, 0);
    }
    
    public boolean dfs(TreeNode root, int sum, int pre) {
        if(root == null) return false;
        pre = pre + root.val;
        if(root.left == null && root.right == null && pre == sum){
            return true;
        }
        return dfs(root.left, sum, pre) || dfs(root.right, sum, pre);
    }
}

