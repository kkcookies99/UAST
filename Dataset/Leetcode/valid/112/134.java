    public boolean XXX(TreeNode root, int targetSum) {
        return process(root,targetSum,0);
    }   

    //dp
    public boolean process(TreeNode root,int targetSum,int sum){
        if(root == null){return false;}
        if((root.val + sum == targetSum) && (root.right == null && root.left == null) ){
            return true;
        }
        return process(root.right,targetSum,sum + root.val) || process(root.left,targetSum,sum + root.val);

    }

