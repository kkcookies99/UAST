  public boolean XXX(TreeNode root) {
        return root==null?true:XXXs(root.left,root.right);
    }
    public boolean XXXs(TreeNode left, TreeNode right){
        if(left==null&&right==null)return true;
        if(left==null||right==null)return false;
        return left.val==right.val&&XXXs(left.right,right.left)&&XXXs(left.left,right.right);
    }

