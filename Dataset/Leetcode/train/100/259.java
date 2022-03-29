 public boolean XXX(TreeNode p, TreeNode q) {
        
        //只有两个不为空的树才有往下比较值的意义
        if(p != null && q != null){
            if(p.val != q.val){
                return false;
            }
            return XXX(p.left,q.left) && XXX(p.right,q.right);
        }else if(p == null && q == null){
            return true;
        }else{
            return false;
        }
        
    }

