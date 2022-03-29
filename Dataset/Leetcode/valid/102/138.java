public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode lastNode = root;
        TreeNode nextLastNode = null;
        List<Integer> curRow = new ArrayList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode top = queue.poll();

            if (top.left != null) {
                queue.offer(top.left);
                nextLastNode = top.left;
            }
            if (top.right != null) {
                queue.offer(top.right);
                nextLastNode = top.right;
            }

            curRow.add(top.val);
            if (top == lastNode) {
                res.add(new ArrayList<>(curRow));
                curRow.clear();
                lastNode = nextLastNode;
            }
        }

        return res;
    }

