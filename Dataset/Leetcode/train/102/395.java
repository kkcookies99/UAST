class Solution {
    public List<List<Integer>> XXX(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty()) {
        	List<Integer> level = new ArrayList<>();
        	for(;i > 0; i--) {
        		if(queue.peek().left != null) {
            		queue.offer(queue.peek().left);
            	}
            	if(queue.peek().right != null) {
            		queue.offer(queue.peek().right);
            	}
            	level.add(queue.poll().val);
        	}
        	i = queue.size();
            res.add(level);
        }
        return res;
    }
}

