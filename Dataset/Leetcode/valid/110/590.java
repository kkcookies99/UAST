public boolean XXX(TreeNode root) {
    return root == null || (Math.abs(XXX(root.left, 0) - XXX(root.right, 0)) <= 1 && XXX(root.left) && XXX(root.right));
}

public int XXX(TreeNode root, int i) {
    return root == null ? i : Math.max(XXX(root.left, i + 1), XXX(root.right, i + 1));
}
