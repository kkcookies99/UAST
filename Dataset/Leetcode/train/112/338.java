 public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;
        Deque<TreeNode> node_queue = new ArrayDeque<>();
        Deque<Integer> sum_queue = new ArrayDeque<>();
        node_queue.offer(root);
        sum_queue.offer(root.val);
        while (!node_queue.isEmpty()) {
            TreeNode node = node_queue.poll();
            int sum = sum_queue.poll();
            if (node.left == null && node.right == null && sum == targetSum) {
                return true;
            }
            if (node.left != null) {
                node_queue.offer(node.left);
                sum_queue.offer(sum + node.left.val);
            }
            if (node.right != null) {
                node_queue.offer(node.right);
                sum_queue.offer(sum + node.right.val);
            }
        }
        return false;
    }

