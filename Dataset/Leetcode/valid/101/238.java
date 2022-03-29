 class Solution {
    public boolean XXX(TreeNode root) {
        return isSameTree(root.left,root.right);
    }

        public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if ((p == null || q == null))
            return false;
        return isSameTree(p.left, q.right) && p.val == q.val && isSameTree(p.right, q.left);
    }
}

