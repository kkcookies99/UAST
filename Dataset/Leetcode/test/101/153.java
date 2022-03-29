     public boolean XXX(TreeNode root) {
    if(root == null)
        return true;	
    return XXX2(root.left, root.right);
	}

	public boolean XXX2(TreeNode left, TreeNode right) {
		
		if(left == null && right == null)
			return true;
		if(left == null || right == null)
			return false;
		if(left.val == right.val)
			return  XXX2(left.left, right.right) && XXX2(left.right, right.left);
		else
			return false;
	}

