 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        //如果不是两个都不空
        if (!(p!=null && q!=null)) return false;
        if (p.val!=q.val) return false;
        return (XXX(p.left,q.left) && XXX(p.right,q.right));
    }
}

