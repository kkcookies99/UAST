public List<List<Integer>> XXX(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> integers = new ArrayList<>();
            int count = queue.size();
            for (int i = count; i > 0; i--) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    integers.add(poll.val);
                    if (poll.left != null) {
                        queue.add(poll.left);
                    }
                    if (poll.right != null) {
                        queue.add(poll.right);
                    }
                }
            }
            result.add(integers);
        }
        return result;
    }

