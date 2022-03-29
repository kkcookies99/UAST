class Solution {
    public boolean XXX(TreeNode root) {
		return process(root).isBalance;
	}

	// 要判断平衡二叉树，
	// 首先要确定其左右孩子是否为平衡二叉树，
	// 然后要左子树的高度与右子树高度之差小于2。
	// 问左右子树要的信息有，是否为平衡二叉树，以及高度
	static class Info {
		boolean isBalance;
		int height;

		Info(boolean _isBalance, int _height) {
			isBalance = _isBalance;
			height = _height;
		}
	}

	Info process(TreeNode root) {
		if (root == null) {
			return new Info(true, 0);
		}
		Info left = process(root.left);
		Info right = process(root.right);
		int height = 1 + Math.max(left.height, right.height);
		boolean isBalance = left.isBalance && right.isBalance && Math.abs(left.height - right.height) < 2;
		return new Info(isBalance, height);
	}

    
}

