    public boolean XXX(TreeNode root, int targetSum) {
        return deep(0, root, targetSum);
    }

    public boolean deep(int number, TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return number + node.val == targetSum;
        }

        boolean lr = deep(number + node.val, node.left, targetSum);
        boolean rr = deep(number + node.val, node.right, targetSum);
        return lr || rr;
    }

