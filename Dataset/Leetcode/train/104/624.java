 public int XXX(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return Math.max(XXX(root.left),XXX(root.right)) + 1;
    }

