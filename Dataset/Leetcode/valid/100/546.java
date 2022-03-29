 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return check(p,q);
    }
    public boolean check(TreeNode p,TreeNode q){
        if((q!=null&&p==null)||(q==null&&p!=null))
            return false;
        if(p==null&&q==null)
            return true;
        if(p.val!=q.val)
            return false;
        return check(p.left,q.left)&&check(p.right,q.right);
    }
}

