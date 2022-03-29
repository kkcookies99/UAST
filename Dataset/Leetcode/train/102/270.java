public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if (root == null) {
        return list;
    }
    return bfs(root);
}

private List<List<Integer>> bfs(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    Queue<TreeQueue> queue = new LinkedList<>();
    queue.offer(new TreeQueue(root, 0));
    while (!queue.isEmpty()) {
        TreeQueue treeQueue = queue.poll();
        TreeNode treeNode = treeQueue.treeNode;
        int depth = treeQueue.depth;
        if (list.size() < depth + 1) {
            list.add(new ArrayList<>());
        }
        list.get(depth).add(treeNode.val);
        if (treeNode.left != null) {
            queue.offer(new TreeQueue(treeNode.left, depth + 1));
        }
        if (treeNode.right != null) {
            queue.offer(new TreeQueue(treeNode.right, depth + 1));
        }
    }
    return list;
}

