 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p ==null && q == null;
        return (q.val == p.val) && XXX(p.left,q.left) && XXX(p.right,q.right);
    }
}

