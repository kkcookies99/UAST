  public boolean XXX(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        TreeNode p = root;
        Integer preVal = null ;
        while( p != null || !stack.isEmpty() ){
            if(p != null){
                stack.push(p);
                p = p.left;
            }else{
                 p = stack.pop();
                 int val = p.val;
                 if(preVal == null){
                     preVal = val;
                 }else{
                    if(val <= preVal){
                      return false;
                    }
                    preVal = val;
                 }
                 p = p.right;
            }
        }
        return true;
    }

