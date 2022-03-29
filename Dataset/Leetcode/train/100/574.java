     public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        
        boolean left = XXX(p.left,q.left);
        boolean right = XXX(p.right,q.right);
        return left && right;
    }


