 public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.offerFirst(root);
                root = root.left;
            }
            root = stack.pollFirst();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

