public int XXX(TreeNode root) {
		if (root == null)
			return 0;
		return maxCount(root, 0, 0);
	}

	private int maxCount(TreeNode root, int curr, int max) {

		if (root != null) {// 当前节点不为空就加1
			curr += 1;
		}

		if (root.left == null && root.right == null) { // 判断所有子节点都为空时，判断当前分之最大值
			return Math.max(curr, max);
		}

		if (root.left != null) { // 子分支不为空 继续遍历
			max = maxCount(root.left, curr, max);
		}

		if (root.right != null) { // 子分支不为空 继续遍历
			max = maxCount(root.right, curr, max);
		}

		return max;
	}

