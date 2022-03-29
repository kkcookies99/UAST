     public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null) {
            return q == null;
        } else if (q == null) {
            return false;
        }
        
        return p.val == q.val && XXX(p.left, q.left) && XXX(p.right, q.right);
    }

