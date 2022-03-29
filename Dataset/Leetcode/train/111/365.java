class Solution {
    public int XXX(TreeNode root) {
        if (root == null) return 0;
        // 用队列存储每次扩散的节点
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        // 根节点是第一层
        int depth = 1;

        // 寻找最小深度
        while (!q.isEmpty()) {
            int length = q.size();
            // 向周围扩散节点
            for (int i = 0; i < length; i++) {
                TreeNode cur = q.poll();
                // 找到最小深度的叶子节点了
                if (cur.left == null && cur.right == null) return depth;
                // 将当层节点的子节点逐个加入队列
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            depth++;
        }

        return depth;
    }
}

