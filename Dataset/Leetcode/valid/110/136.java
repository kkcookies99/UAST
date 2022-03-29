    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        final int left = f(root.left, 1);
        final int right = f(root.right, 1);
        return Math.abs(left - right) <= 1 && XXX(root.left) && XXX(root.right);
    }

    private int f(TreeNode left, int height) {
        if (left == null) {
            return height;
        }
        return Math.max(f(left.left, height + 1), f(left.right, height + 1));
    }

