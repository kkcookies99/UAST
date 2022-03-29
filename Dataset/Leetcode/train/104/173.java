 public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int i = XXX(root.left);
        int j = XXX(root.right);
        return i>j?i+1:j+1;
    }

