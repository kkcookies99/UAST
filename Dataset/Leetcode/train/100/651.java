 public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null || q==null) return q==null && p==null;
        return p.val==q.val && XXX(p.left, q.left) && XXX(p.right,q.right);
    }

