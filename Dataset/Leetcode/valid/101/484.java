 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p != null && q!= null && p.val == q.val){
            return isSame(p.left,q.right)&&isSame(p.right,q.left);
        }else{
            return false;
        }
    }
}

