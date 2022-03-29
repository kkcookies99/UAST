 class Solution {
   public boolean XXX(TreeNode root) {
        try {
            dfs(root);
        }catch (Exception ex){
            return false;
        }
        return true;
    }
    
    private TreeNode pre;
    
    private void dfs(TreeNode root) throws Exception {
        if (root == null){
            return;
        }
        dfs(root.left);
        if (pre != null){
            if (root.val <= pre.val){
                throw new Exception("not BST.");
            }
        }
        pre = root;
        dfs(root.right);
    }
}

