      public  int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int XXX = 1;
        int levelSize = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (node.left == null && node.right == null) {
                return XXX;
            }


            if (--levelSize == 0) {
                if (queue.size() == 0) {
                    return XXX;
                } else {
                    XXX++;
                    levelSize = queue.size();
                }
            }
        }
        return XXX;
    }

