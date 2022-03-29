public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = XXX(root.left);
        int right = XXX(root.right);
        return root.left!=null&&root.right!=null ? 1+Math.min(left,right) : (root.left==null?right+1:left+1);
    }

