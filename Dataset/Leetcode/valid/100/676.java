 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        /*出口*/
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        /*p和q的val相等*/
        return XXX(p.left, q.left) && XXX(p.right, q.right);

    }
}

