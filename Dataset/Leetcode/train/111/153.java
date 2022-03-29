public int XXX(TreeNode root) {
    if (root == null) {
        return 0;
    }
    Deque<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int XXX = 0;
    while (!queue.isEmpty()) {
        int size = queue.size();
        while (size-- > 0) {
            TreeNode cur = queue.poll();
            if (cur.left == null && cur.right == null) {
                return XXX + 1;
            }
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        ++XXX;
    }
    return XXX;
}

