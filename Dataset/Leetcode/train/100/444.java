     public boolean XXX(TreeNode p, TreeNode q) {
        if (p != null && q != null && p.val == q.val) {
            return XXX(p.left, q.left) && XXX(p.right, q.right);
        }
        if (p == null && q == null) return true;   
        return false;
    }

