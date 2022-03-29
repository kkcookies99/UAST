   public boolean XXX(TreeNode root) {
    if (root == null) return true;
    
    return isSameTree(root.left, root.right);
  }
  
  public boolean isSameTree(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if (left != null && right == null) return false;
    if (left == null && right != null) return false;
    
    if (left.val != right.val) return false;
    
    return isSameTree(left.left, right.right) && isSameTree(left.right, right.left);
  }`

