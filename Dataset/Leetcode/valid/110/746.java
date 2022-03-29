 public boolean XXX(TreeNode root) {
    if(root == null || (root.left==null && root.right==null))
    	return true;
    return Math.abs(height(root.left) - height(root.right))<=1 && XXX(root.left)&& XXX(root.right);
}

private int height(TreeNode node){
	if(node==null) 
		return 0;
	return Math.max(height(node.left), height(node.right)) + 1;
}
