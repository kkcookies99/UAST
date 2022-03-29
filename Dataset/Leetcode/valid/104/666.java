 public int XXX(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int max;
			int left = XXX(root.left);
			int right = XXX(root.right);
			if (left > right) {
				max = 1 + left;
			} else {
				max = 1 + right;
			}
			return max;
		}

