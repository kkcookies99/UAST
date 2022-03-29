 public boolean XXX(TreeNode root) {
        if(root == null)
            return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 
            && XXX(root.left) 
            && XXX(root.right);
    }
    
    //返回以节点root为根的树的高度
    private int depth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }

