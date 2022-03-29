     public boolean XXX(TreeNode root) {
        TreeNode template = root;
        TreeNode treeNode = invertTree(root);
        return isSame(template, treeNode);
    }

    private boolean isSame(TreeNode template, TreeNode treeNode) {
        if (template == null && treeNode == null) {
            return true;
        }
        if (template == null && treeNode != null) {
            return false;
        }
        if (template != null && treeNode == null) {
            return false;
        }
        if (template.val != treeNode.val) {
            return false;
        }
        return isSame(template.left, treeNode.left) && isSame(template.right, treeNode.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(root.val);
        TreeNode leftTemplate = root.left;
        treeNode.left = invertTree(root.right);
        treeNode.right = invertTree(leftTemplate);
        return treeNode;
    }

