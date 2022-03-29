 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        } else if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            } else {
                return XXX(p.left,q.left) && XXX(p.right,q.right);
            }
        } else {
            return true;
        }
    }
}

