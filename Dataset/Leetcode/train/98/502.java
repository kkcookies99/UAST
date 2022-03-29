 class Solution {
    public boolean XXX(TreeNode root) {
		Info info = processed(root);
		return info == null || info.isBST;
	}

	//判断一棵二叉树是不是BST
	//首先要判断左右子树是不是BST，
	//然后判断当前节点是否大于左子树的最大值，是否小于右子树的最小值
	// 所以需要向子树要的信息有：是否为BST，以及当前树上的最大值以及最小值。
	static class Info {
		boolean isBST;
		int min, max;

		Info(boolean _isBST, int _min, int _max) {
			isBST = _isBST;
			min = _min;
			max = _max;
		}
	}

	Info processed(TreeNode root) {
		if (root == null) {
			return null;
		}
		Info left = processed(root.left);
		Info right = processed(root.right);
		int max = root.val, min = root.val;
		if (left != null) {
			max = Math.max(max, left.max);
			min = Math.min(min, left.min);
		}
		if (right != null) {
			min = Math.min(min, right.min);
			max = Math.max(max, right.max);
		}
		boolean isBST = true;
		if ((left != null && (!left.isBST || root.val <= left.max) )
				|| (right != null && (!right.isBST || root.val >= right.min))) {
			isBST = false;
		}

		return new Info(isBST, min, max);

	}
}

