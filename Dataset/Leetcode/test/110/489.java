  public boolean XXX(TreeNode root) {

        return helper(root) !=-1;
    }


    private int helper(TreeNode root){

        if(root==null){
            return 0;
        }

        int left=helper(root.left);
        if(left==-1 ){
            return -1;
        }
        int right=helper(root.right);

        if(right==-1 ){
            return -1;
        }

        return Math.abs(right-left)>1 ?-1:Math.max(left,right)+1;
    }

