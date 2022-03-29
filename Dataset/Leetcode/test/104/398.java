public int XXX(TreeNode root) {
        //递归出口
        if(root==null){
            return 0;
        }
        //查左子树
        int left=XXX(root.left)+1;    
        //查右子树
        int right=XXX(root.right)+1;
        
        return Math.max(left,right);     
    }
