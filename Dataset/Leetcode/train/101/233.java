 public boolean XXX(TreeNode root) {
        return isTwoTreeSymmetric(root.left, root.right);
    }
private boolean isTwoTreeSymmetric(TreeNode root1, TreeNode root2) {
        return root1 == null ? root2 == null : root2 != null && root1.val == root2.val && isTwoTreeSymmetric(root1.left, root2.right) && isTwoTreeSymmetric(root1.right, root2.left);
}

