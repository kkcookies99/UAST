public int XXX(TreeNode root) {
    int maxRight = 1, maxLeft = 1;
    if (root == null) {
        return 0;
    }
    if (root.left != null) {
        maxLeft = XXX(root.left);
        maxLeft++;
    }
    if (root.right != null) {
        maxRight = XXX(root.right);
        maxRight++;
    }
    return maxLeft > maxRight ? maxLeft : maxRight;

}

