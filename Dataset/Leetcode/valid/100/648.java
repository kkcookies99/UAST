  public boolean XXX(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (p != null && q == null)) {
               return false;
           }
           
           if(p == null && q == null) {
               return true;
           }
        
            if(p.val != q.val) {
                return false;
            }
            if( XXX(p.right, q.right) &&  XXX(p.left, q.left)) {
                return true;
            } else {
                return false;
            }
    }

