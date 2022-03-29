 public boolean XXX(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            return XXX(p.left, q.left) && XXX(p.right, q.right);
        }
        if (p == null && q == null) {
            return true;
        }
        return false;
    }

