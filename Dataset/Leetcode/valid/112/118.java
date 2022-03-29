public boolean XXX(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        return DFS(root, targetSum, 0);
    }

    public boolean DFS(TreeNode root, int targetSum, int sum) {
        if (root != null)
            sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == targetSum)
                return true;
        }
        boolean left = false, right = false;
        if (root.left != null)
            left = DFS(root.left, targetSum, sum);
        if (root.right != null)
            right = DFS(root.right, targetSum, sum);
        return left || right;
    }

