 public boolean XXX(TreeNode p, TreeNode q) {
        // 递归深入
        if(p == null && q == null) {
            return true;
        }else if(p == null || q == null) {
            return false;
        }else if(p.val != q.val) {
            return false;
        }
        return XXX(p.left, q.left) && XXX(p.right, q.right);
    }

