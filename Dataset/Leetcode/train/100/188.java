 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val) {
            boolean f1 = XXX(p.left, q.left);
            boolean f2 = XXX(p.right, q.right);
            return f1 && f2;
        } else {
            return false;
        }
    }
}

