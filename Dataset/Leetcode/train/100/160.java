  public boolean XXX(TreeNode p, TreeNode q) {
        if((p==null&&q!=null)||(p!=null&&q==null))return false;
        if((p==null&&q==null)||(p.left==null&&p.right==null&&q.left==null&&q.right==null&&
        q.val==p.val))return true;
        else if(p.val==q.val&&p.left!=null&&p.right==null
        &&q.left!=null&&q.right==null){
            return XXX(p.left,q.left);
        }
        else if(p.val==q.val&&p.left==null&&p.right!=null&&
        q.left==null&&q.right!=null){
            return XXX(p.right,q.right);
        }else if(p.val==q.val&&p.left!=null&&p.right!=null&&
        q.left!=null&&q.right!=null){
            return XXX(p.left,q.left)&&XXX(p.right,q.right);
        }else return false;
    }

