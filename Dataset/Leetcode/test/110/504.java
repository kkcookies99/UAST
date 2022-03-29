public boolean XXX(TreeNode root) {
		if (root == null) {
			return true;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (Math.abs(balance(node.left) - balance(node.right)) > 1) {
				return false;
			}
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		
		return true;
	}
	
	
	
	/**
	 * 给出二叉树的node节点，计算出树的高度；
	 * @param node
	 * @return
	 */
	private int balance(TreeNode node) {
		if (node ==  null) {
			return 0;
		}
		
		return Math.max(balance(node.left), balance(node.right)) + 1;
	}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


