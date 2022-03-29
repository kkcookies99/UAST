     public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        if (!XXX(p.left, q.left) || !XXX(p.right, q.right)) return false;
        return true;
    }

