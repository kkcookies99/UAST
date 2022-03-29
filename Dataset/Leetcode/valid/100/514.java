 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        boolean left=XXX(p.left,q.left);
        if(p.val!=q.val) return false;
        boolean right=XXX(p.right,q.right);
        return left&&right;
    }
}

