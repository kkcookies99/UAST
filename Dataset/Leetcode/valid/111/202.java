class Solution {
    public int XXX(TreeNode root) {
        if (root == null){
            return 0;
        }
       dfs(root, 1);
       return res;
    }
    private int res = Integer.MAX_VALUE;
    private void dfs(TreeNode root, int tmp){
        if (root.left == null && root.right == null){
            res = Math.min(res, tmp);
            return;
        }
        if (root.left != null && tmp < res){
            dfs(root.left, tmp + 1);
        }
        if (root.right != null && tmp < res){
            dfs(root.right, tmp + 1);
        }
    }
}

