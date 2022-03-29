     public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return (root.left != null && XXX(root.left, targetSum - root.val)) || (root.right != null && XXX(root.right, targetSum - root.val));
    }

