 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null && sum == 0) return false;
        return dfs(root, sum);
        
    }

    public boolean dfs(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
          return true;           
        }
        
        boolean left =  dfs(root.left, sum);
        boolean right =  dfs(root.right, sum);
        //sum += root.val;
        return left || right;
    }
}

