class Solution {
    public int XXX(TreeNode root) {
        if(root == null) return 0;
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);  // 根节点入队
        while(!q.isEmpty()) {
            int size = q.size();    // 当前层的的节点的个数
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                // 如果左孩子右孩子都为空了，则直接返回深度
                if (cur.left == null && cur.right == null) return depth;
                if (cur.left != null) q.offer(cur.left);    // 如果左孩子不为空，则左孩子入队
                if (cur.right != null) q.offer(cur.right);  // 如果右孩子不为空，则右孩子入队
            }
            depth++;    // 每结束一层深度+1
        }
        return depth;

    }
}


