public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        //当前节点满足条件，并且子节点也满足
        return Math.abs(height(root.left)-height(root.right))<=1&&XXX(root.left)&&XXX(root.right);
    }
    //查找每个节点的高度
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left)+1,height(root.right)+1);
    }


