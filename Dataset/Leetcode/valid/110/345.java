    public boolean XXX(TreeNode root) {
        return root == null || !(Math.abs(height(root.left) - height(root.right)) > 1) && XXX(root.left) && XXX(root.right);
    }

    private int height(TreeNode root) {
        return root == null ? 0 : Math.max(height(root.left), height(root.right)) + 1;
    }

