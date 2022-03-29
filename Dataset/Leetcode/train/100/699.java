 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        return q != null && p.val == q.val && XXX(p.left, q.left) && XXX(p.right, q.right);
    }
}

