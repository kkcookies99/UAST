public int XXX(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    Queue<TreeNode> temp = new LinkedList<>();
    if (root != null) q.add(root);
    int count = 0;
    while(!q.isEmpty()) {
        count ++;
        while (!q.isEmpty()) {
            TreeNode head = q.remove();
            if (head.right == null && head.left == null)
                return count;
            if (head.left != null) temp.add(head.left);
            if (head.right != null) temp.add(head.right);
        }
        while (!temp.isEmpty()) {
            q.add(temp.remove());
        }
    }
    return count;
}
