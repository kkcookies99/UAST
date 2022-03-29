    public int XXX(TreeNode root) {
        return deep(root);
    }

    private int deep(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.left == null && treeNode.right == null) {
            return 1;
        }
        return Math.max(deep(treeNode.left), deep(treeNode.right)) + 1;
    }

