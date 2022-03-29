  public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        if(left!=null && left.val>= root.val){
            return false;
        }
        if(right!=null&& right.val<=root.val){
            return false;
        }
        return XXX(root.left) && XXX(root.right);
    }

