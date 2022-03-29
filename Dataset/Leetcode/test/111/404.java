class Solution {
    public int XXX(TreeNode root) {
        if(root == null)
            return 0;
        Deque<TreeNode> que = new LinkedList<>();
        int depth = 0;
        TreeNode p = root;
        que.offer(p);
        while(!que.isEmpty()) {
            depth++;
            int len = que.size();
            for(int i = 0; i < len; i++) {
                p = que.poll();
                if(p.left == null && p.right == null) {
                    return depth;
                }
                if(p.left != null)
                    que.offer(p.left);
                if(p.right != null)
                    que.offer(p.right);
            }
        }
        return depth;
    }
}

