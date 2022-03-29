 public boolean XXX(TreeNode root) {
        return XXX(root,root);
    }
public boolean XXX(TreeNode t1,TreeNode t2){
       if(t1==null&&t2==null) return true;
       if(t1!=null&&t2!=null){
           if(t1.val!=t2.val) return false;
           return XXX(t1.left,t2.right)&&XXX(t1.right,t2.left);
       }
       return false; 
    }

