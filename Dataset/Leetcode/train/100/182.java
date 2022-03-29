 public boolean XXX(TreeNode p, TreeNode q) {
        return p == null || q == null 
            ? q == p
            : p.val == q.val && XXX(p.left, q.left) && XXX(p.right, q.right);
}

