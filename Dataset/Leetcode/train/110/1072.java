     public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (treeHeight(root) == -1) return false;
        return true;
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0;
        int left, right;
        if ((left = treeHeight(node.left)) == -1)
            return -1;
        if ((right = treeHeight(node.right)) == -1)
            return -1;
        if (Math.abs(left - right) > 1) 
            return - 1;
        return Math.max(left, right) + 1;
    }

