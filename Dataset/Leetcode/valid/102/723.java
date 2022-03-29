 class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        list.add(new ArrayList<Integer>());
        int size = 1;
        int level = 0;;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
	while (!queue.isEmpty()) {
	    size--;
	    TreeNode node = queue.poll();
	    list.get(level).add(node.val);
	    if (node.left != null) {
	        queue.offer(node.left);
	    }
	    if (node.right != null) {
	        queue.offer(node.right);
	    }
	    if (size == 0) {
	        size = queue.size();
		level++;
                if(!queue.isEmpty()) list.add(new ArrayList<Integer>());
	    }
	}
	return list;
    }
}

