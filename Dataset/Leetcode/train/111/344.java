    public int XXX(TreeNode root) {
        int depth = 0;
        Deque<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return depth;
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                root = queue.removeFirst();
                if (root.left == null && root.right == null)
                    return depth;
                if (root.left != null)
                    queue.addLast(root.left);
                if (root.right != null)
                    queue.addLast(root.right);
            }
        }
        return depth;
    }

