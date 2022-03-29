 class Solution {
    public boolean XXX(TreeNode root) {
        if(null == root){
            return true;
        }
        return XXX(root.left,root.right);
    }
    private boolean XXX(TreeNode p,TreeNode q){
        if(null == p && null == q){
            return true;
        }
        if(null == p||null==q){
            return false;
        }
        if(p.val == q.val){
            return XXX(p.left,q.right) && XXX(p.right,q.left);
        }
        return false;
    }
}

