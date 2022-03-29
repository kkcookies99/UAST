 public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        if(p!=null&&q==null||q!=null&&p==null||q.val!=p.val) return false;
        return XXX(p.left,q.left)&&XXX(p.right,q.right);   
    }

