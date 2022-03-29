public List<List<Integer>> XXX(TreeNode root) {
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) {
			return res;
		}
		// 我们使用LinkedList来做为我们的先入先出的队列
		LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
		queue.addLast(new Pair<TreeNode, Integer>(root, 0));
		while(!queue.isEmpty()){
			Pair<TreeNode, Integer> front = queue.removeFirst();
			TreeNode node = front.getKey();
			int level = front.getValue();
			if(level == res.size()) {
				res.add(new ArrayList<Integer>());
			}
			assert level < res.size();
			
			res.get(level).add(node.val);
			if(node.left != null) {
				queue.addLast(new Pair<TreeNode, Integer>(node.left, level + 1));
			}
			if(node.right != null) {
				queue.addLast(new Pair<TreeNode, Integer>(node.right, level + 1));
			}
		}
		return res;
	}

