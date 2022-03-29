public boolean XXX(TreeNode root) {
        if(root == null){
			return true;
		}
        return Math.abs(treeDeep(root.left) - treeDeep(root.right))<=1;
	}

	public static int treeDeep(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int l_len = treeDeep(root.left);
		int r_len = treeDeep(root.right);

		return Math.max(l_len, r_len) + 1;
	}

