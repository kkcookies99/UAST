    public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int left = XXX(root.left);
        int right = XXX(root.right);
        return (left>right ? left: right) + 1;
    }

