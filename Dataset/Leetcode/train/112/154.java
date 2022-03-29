    public boolean XXX(TreeNode root, int targetSum) {
        if(root!=null)
        {
            targetSum -= root.val;            
        //   
            if(XXX(root.left, targetSum))
                return true;
            if(XXX(root.right, targetSum))
                return true;
            if(root.left==null&&root.right==null){
                if(targetSum==0)
                    return true;
            }
        }
        return false;        
    }

