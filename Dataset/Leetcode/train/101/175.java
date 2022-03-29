 public boolean XXX(TreeNode root) {
		if(root == null) {
			return false;
		}
		return duic(root.left, root.right);
	}

	private boolean duic(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left == null || right == null) {//因为此处已经必定有一个以上不为空,所以只需要判断是否有为空的
			return false;
		} else if (left.val == right.val) {
			return duic(left.left, right.right) && duic(left.right, right.left);
		} else {
			return false;
		}
	}

