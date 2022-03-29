 class Solution {
    TreeNode pre = null;
    boolean res = true;
    public boolean XXX(TreeNode root) {
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        if(root == null){
            return ;
        }
        dfs(root.left);
        if(pre != null){
            if(root.val <= pre.val){
                res = false;
            }
        }
        pre = root;
        dfs(root.right);
    }
}

