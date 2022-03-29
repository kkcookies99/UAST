  public boolean XXX(TreeNode root) {
		if(root == null)
			return true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int index = 0, size = queue.size();
		// 层序遍历 
		while (index++ < size) {
			root = queue.poll(); // 从 队列中 推出
			if (root != null) {
				queue.add(root.left);
				queue.add(root.right);
			}
			if (index == size) {
				// 检查 每一层是否 呈镜像对称
				List<TreeNode> list = new ArrayList<>(queue);
				int c = 0;
				for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
					if ((list.get(i) != null && list.get(j) == null) || (list.get(i) == null && list.get(j) != null))
						return false;
					else if ((list.get(i) == null && list.get(j) == null)) {
						c += 2;
						continue;
					}
					if (list.get(i).val != list.get(j).val)
						return false;
				}
				if (c == list.size())
					return true;
				
				index = 0;
				size = queue.size();
			}
		}
		return true;
	}

