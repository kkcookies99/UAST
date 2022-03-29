public int XXX(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> queue = new ArrayDeque<>();
        int depth = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            boolean flag =  false;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                if (node.left == null && node.right == null) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        return depth;
    }

