 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if ((p == null || q == null))
            return false;
        return XXX(p.left, q.left) && p.val == q.val && XXX(p.right, q.right);
    }
}

