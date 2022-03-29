    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        boolean flag=XXX(root.left)&&XXX(root.right);
        return flag&&Math.abs(depth(root.left)-depth(root.right))<=1;
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        return Math.max(left,right)+1;
    }

