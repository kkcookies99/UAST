 public boolean XXX(TreeNode root) {
    if (root == null) return true;
    int leftDepth = this.getDepth(root.left);
    int rightDepth = this.getDepth(root.right);
    if ((leftDepth - rightDepth > 1) || (leftDepth - rightDepth < -1))
        return false;
    return XXX(root.left) && XXX(root.right);
} 
private int getDepth(TreeNode root){
    if (root == null) return 0;
    int leftDepth = getDepth(root.left);
    int rightDepth = getDepth(root.right);
    return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
}

