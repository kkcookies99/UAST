 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null) return q==null;
        if(q==null) return false;
        if(p.val!=q.val) return false;
        return XXX(p.left, q.left)&&XXX(p.right, q.right);
    }
}

