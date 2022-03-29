public int XXX(TreeNode root) {
		if(root == null) {

			return 0;
		}
		if (root.left == null && root.right != null) {
			return 1 + XXX(root.right);
		}
		if (root.right == null && root.left != null) {
			return 1 + XXX(root.left);
		}
		int left = XXX(root.left);
		int right = XXX(root.right);
		return left < right ? left + 1: right + 1;
	}

