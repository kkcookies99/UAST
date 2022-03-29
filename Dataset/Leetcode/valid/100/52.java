 public boolean XXX(TreeNode p, TreeNode q) {
        if(q == null || p == null) return q == null && p == null;
        return (p.val == q.val) && XXX(p.left,q.left) && XXX(q.right,p.right);
    }
