   public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int depth = 0;
        while (!deque.isEmpty()) {
            depth++;
            int size = deque.size();
            while (size-- > 0) {
                TreeNode treeNode = deque.pollFirst();
                if (treeNode.left == null && treeNode.right == null) {
                    return depth;
                }
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
        }
        return -1;
    }

