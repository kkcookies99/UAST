public int XXX(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int level = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            level++;
            while (n > 0) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) return level;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                n--;
            }
            
        }
        return level;
    }

