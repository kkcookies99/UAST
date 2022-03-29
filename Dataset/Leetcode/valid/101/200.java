 public boolean XXX(TreeNode root) {
    return validate(root, root);
}

private boolean validate(TreeNode x, TreeNode y) {
    if (x == null && y == null)
        return true;
    if ((x != null && y == null) || (x == null && y != null))
        return false;
    if (x.val != y.val)
        return false;
    boolean condition1 = validate(x.left, y.right);
    boolean condition2 = validate(x.right, y.left);
    return condition1 && condition2;
}

