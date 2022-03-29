 public boolean XXX(TreeNode root) {
        if(root==null)
            return true;
       if(weight(root)==-1){
           return false;
       }
       else
           return true;
    }
    public int weight(TreeNode root) {
         if(root==null){
            return 0;
        }
        int a=weight(root.left);
        if(a==-1){
           return -1;
        }
        int b=weight(root.right);
        if(b==-1){
            return -1;
        }
        if(Math.abs(a-b)>1){
            return -1;
        }
        return a>b?a+1:b+1;
    }

