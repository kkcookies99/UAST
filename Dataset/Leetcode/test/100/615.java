 public boolean XXX(TreeNode p, TreeNode q) {
        return pd(p,q);
    }

    private boolean pd(TreeNode p, TreeNode q) {
        if (p == null && q ==null){return true;}
        if (p == null || q == null){return false;}
        if (p.val!=q.val){return false;}
        return pd(p.left,q.left)&&pd(p.right,q.right);

    }

