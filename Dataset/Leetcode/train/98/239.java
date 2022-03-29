  public boolean XXX(TreeNode root) {
		// 二叉搜索树中序遍历必须单调递增 按照左根右的顺序
		List<Integer> res = new ArrayList<>();
		Deque<TreeNode> stack = new ArrayDeque<>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			// 通到最左边之后弹出一个
			root = stack.pop();
			if (!res.isEmpty() && res.get(res.size() - 1) >= root.val) {
				return false;
			}
			res.add(root.val);
			root = root.right;

		}
		return true;

	}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


