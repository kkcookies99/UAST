 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            if(!XXX(p.left, q.left)) {
                return false;
            }
            if(!XXX(p.right, q.right)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

