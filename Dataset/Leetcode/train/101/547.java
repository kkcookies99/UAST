 class Solution {
    public boolean XXX(TreeNode root) {
        if(null == root){
            return true;
        }
        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return p.val == q.val && helper(p.left,q.right) && helper(p.right,q.left);
    }
}

