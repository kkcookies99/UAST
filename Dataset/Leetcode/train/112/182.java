    public boolean XXX(TreeNode root, int targetSum) {
        return root != null && (root.left == null && root.right == null ? targetSum == root.val : XXX(root.left, targetSum - root.val) || XXX(root.right, targetSum - root.val));
    }

