     public boolean XXX(TreeNode p, TreeNode q) {
        if(q == null && p == null) return true;
        if(q == null || p ==null) return false;
        if(q.val != p.val) return false;
        
        return XXX(q.left, p.left) && XXX(q.right, p.right);
    }

