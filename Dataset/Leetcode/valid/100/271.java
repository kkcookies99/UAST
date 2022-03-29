 public boolean XXX(TreeNode p, TreeNode q) {
        if(p==null){
            return q==null;
        }
        if(q==null){
            return p==null;
        }
        return XXX(p.left,q.left)&&XXX(p.right,q.right)&&(q.val==p.val);
    }

