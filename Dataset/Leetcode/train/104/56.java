    public int XXX(TreeNode root) {
        return root == null ? 0 : Math.max(XXX(root.left) + 1, XXX(root.right) + 1);
    }

