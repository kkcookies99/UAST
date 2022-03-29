 public boolean XXX(TreeNode root) {
        return maxDepthOrN(root) >= 0;
    }

    private int maxDepthOrN(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepthOrN(root.left);
        if (left < 0) {
            return left;
        }
        int right = maxDepthOrN(root.right);

        if (right < 0) {
            return right;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }

