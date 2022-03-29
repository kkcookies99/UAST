     public boolean XXX(TreeNode p, TreeNode q) {
        if(q == null && p == null) return true;
        if(q == null || p ==null) return false;      
        return (q.val == p.val) && XXX(q.left, p.left) && XXX(q.right, p.right);
    }

