class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        int sum = 0;
        if (root == null) return false;
        return dfs(root, targetSum, sum);
    }
    boolean dfs(TreeNode root, int target, int sum){
        if (root == null) {
            return false;
         }
         sum += root.val;
        if (root.left == null && root.right == null) {
            return sum == target;
        }
       return  dfs(root.left, target, sum) || dfs(root.right, target, sum);
    }
}

