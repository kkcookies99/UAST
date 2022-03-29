class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
                if (null != poll.left) {
                    deque.offer(poll.left);
                }
                if (null != poll.right) {
                    deque.offer(poll.right);
                }
            }
        }
        return depth;
    }
}

