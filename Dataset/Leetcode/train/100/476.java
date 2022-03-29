 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        }
        if (null == p ^ null == q) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return XXX(p.left, q.left) && XXX(p.right, q.right);
    }
}

