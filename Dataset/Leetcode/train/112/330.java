     public boolean XXX(TreeNode root, int targetSum) {
        return XXX(root, targetSum, 0);
    }

    public boolean XXX(TreeNode root, int sum, int v) {
        if (root == null) return false;
        v += root.val;
        if (root.left == null && root.right == null) return v == sum;
        return XXX(root.left, sum, v) || XXX(root.right, sum, v);
    }

