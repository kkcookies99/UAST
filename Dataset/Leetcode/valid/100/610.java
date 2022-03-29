 class Solution {
    public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val == q.val) {
            if (XXX(p.left, q.left)) {
                if (XXX(p.right, q.right)) {
                    return true;
                }
            }
        }
        return false;
    }
}

