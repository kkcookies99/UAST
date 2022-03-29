    public boolean XXX(TreeNode root) {
        return depth(root) >= 0;
    }

    private int depth(TreeNode root) {
        int left, right;
        return root == null ? 0:
            (left = depth(root.left)) < 0 ? -1:
            (right = depth(root.right)) < 0 ? -1:
            Math.abs(left - right) > 1 ? -1:
            Math.max(left, right) + 1;
    }

