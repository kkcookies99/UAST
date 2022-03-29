 public boolean XXX(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        if(!sameTree(p.left,q.left)){
            return false;
        }
        if(!sameTree(p.right,q.right)){
             return false;
        }
        return true;
    }

