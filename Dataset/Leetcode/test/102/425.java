	public List<List<Integer>> XXX(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = 1;
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		while (count != 0) {
			List<Integer> list = new ArrayList<Integer>();
			Queue<TreeNode> nextQueue = new LinkedList<TreeNode>();
			while (!queue.isEmpty()) {
				TreeNode node = queue.poll();
				list.add(node.val);
				count--;
				if (node.left != null) {
					nextQueue.add(node.left);
				}
				if (node.right != null) {
					nextQueue.add(node.right);
				}
			}
			finalList.add(list);
			count = nextQueue.size();
			queue = nextQueue;
		}
		return finalList;
	}

