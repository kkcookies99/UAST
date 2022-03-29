public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                   queue.add(node.left); 
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count --;
            }
            sum ++;
        }
        return sum;
    }

