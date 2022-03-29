    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = XXX(root.left);
            int rightHeight = XXX(root.right);
            return ((leftHeight > rightHeight) ? leftHeight : rightHeight) + 1;
        }
    }

