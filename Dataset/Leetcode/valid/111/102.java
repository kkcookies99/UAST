    public int XXX(TreeNode root) {
        if (root == null)
            return 0;
        else
            return XXXs(root);
    }
    public int XXXs(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        if (root.left == null && root.right == null)
            return 1;
        return Math.min(XXXs(root.left), XXXs(root.right)) + 1;
    }

