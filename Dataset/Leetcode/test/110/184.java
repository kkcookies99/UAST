public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        int leftLength = maxDepth(root.left);
        int rightLength = maxDepth(root.right);
        return Math.abs(leftLength - rightLength) <= 1;
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

