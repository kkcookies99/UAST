     public boolean XXX(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        Deque<Integer> numbers = new LinkedList<>();
        while (!deque.isEmpty()) {
            int curSize = deque.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode node = deque.poll();
                if (node.left != null) {
                    deque.offer(node.left);
                    numbers.offer(node.left.val);
                } else {
                    numbers.offer(-1);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                    numbers.offer(node.right.val);
                } else {
                    numbers.offer(-1);
                }
            }
            while (!numbers.isEmpty()) {
                if (numbers.poll() != numbers.removeLast()) {
                    return false;
                }
            }
            
        }
        return true;
    }
}

