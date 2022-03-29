public boolean XXX(TreeNode root) {
    return root==null ? true: Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 
                && XXX(root.left) && XXX(root.right);
}
private int maxDepth(TreeNode root){
    if(root==null) return 0;
    return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
}

