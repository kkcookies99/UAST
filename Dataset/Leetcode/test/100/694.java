 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p == null || q == null ) return false;

        if(p.val != q.val) return false;

        return isSame(p.left, q.left) && isSame(p.right, q.right);

    }
}

