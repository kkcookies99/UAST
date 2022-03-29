    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> level;
        while (!queue.isEmpty()) {
            level = new ArrayList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.remove();
                level.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }

