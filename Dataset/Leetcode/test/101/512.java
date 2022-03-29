 public boolean XXX(TreeNode root) {
		TreeNode node1 = root;
		TreeNode node2 = root;
		TreeNode help1 = null;
		TreeNode help2 = null;
		while(node1 != null || node2 != null) {
			if (node1.val != node2.val)
				return false;
			if (node1.left == null || node2.right == null) {
				if (node1.left != node2.right)
					return false;
				node1 = node1.right;
				node2 = node2.left;
			} else {
				help1 = node1.left;
				help2 = node2.right;
				while(help1.right != null && help1.right != node1)
					help1 = help1.right;
				while(help2.left != null && help2.left != node2)
					help2 = help2.left;
				if (help1.right == null || help2.left == null) {
					if (help1.right  != help2.left)
						return false;
					help1.right = node1;
					help2.left = node2;
					node1 = node1.left;
					node2 = node2.right;
				} else {
					help1.right = null;
					help2.left = null;
					node1 = node1.right;
					node2 = node2.left;
				}
			}
			if (node1 == root || node2 == root) 
				break;
		}
		return node1 == node2;
	}

