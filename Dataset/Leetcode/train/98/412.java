 public boolean XXX(TreeNode root) {
        if (root == null)
            return true;

        if ((root.left != null && root.left.val >= root.val) ||
                (root.right != null && root.right.val <= root.val))
            return false;

        return XXX(root.left) && XXX(root.right)
                && (root.left == null || (max(root.left) < root.val))
                && (root.right == null || (min(root.right) > root.val));
    }

    private int max(TreeNode node){
        while (node.right != null)
            node = node.right;

        return node.val;
    }

    private int min(TreeNode node){
        while (node.left != null)
            node = node.left;

        return node.val;
    }

