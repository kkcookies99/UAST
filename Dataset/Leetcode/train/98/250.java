 public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return validNode(root.left, null, root.val)
                && validNode(root.right, root.val, null);
    }

    private boolean validNode(TreeNode node, Integer bigThan, Integer smallThan) {
        if (node == null) {
            return true;
        }
        if ((bigThan == null || node.val > bigThan) && (smallThan == null || node.val < smallThan)) {
            return validNode(node.left, bigThan, node.val)
                    && validNode(node.right, node.val, smallThan);
        }
        return false;
    }

