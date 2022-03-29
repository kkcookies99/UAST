 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return checked(root.left,root.right);
    }
    public boolean checked(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }else if(p==null||q==null){
            return false;
        }else if(p.val!=q.val){
            return false;
        }else{
            return checked(p.left,q.right) && checked(p.right,q.left);
        }
    }
}

