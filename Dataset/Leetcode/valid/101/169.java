     public boolean XXX(TreeNode root) {

        if (root == null) {
            return true;
        }

        return XXX(root.left, root.right);

    }

    private boolean XXX(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }

        return XXX(node1.left, node2.right) 
                && XXX(node1.right, node2.left);
    }
}