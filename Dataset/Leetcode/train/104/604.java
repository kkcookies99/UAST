 class Solution {
    public int XXX(TreeNode root) {
	if (root == null) return 0;
	Queue<TreeNode> queue = new LinkedList<>();
	queue.offer(root);
	int depth = 0;
	// 记录正在出队那一层的剩余节点数量
	int count = 1;
		
	while (!queue.isEmpty()) {
	    TreeNode node = queue.poll();
	    count--;
		
	    if (node.left != null) queue.offer(node.left);
	    if (node.right != null) queue.offer(node.right);
		
	    // 一层出队完毕，下一层开始出队
	    if (count == 0) {
		count = queue.size();
		depth++;
	    }
	}
	return depth;
    }
}

