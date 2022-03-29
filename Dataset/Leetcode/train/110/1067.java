 public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) return false;
        return XXX(root.left) && XXX(root.right);
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;

        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return 1 + Math.max(left, right);
    }

