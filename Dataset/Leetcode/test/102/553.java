public List<List<Integer>> XXX(TreeNode root) {
        if (root == null) return new ArrayList<>(0);
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int b = 0;
        int e = queue.size();
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            b++;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if(b == e){
                b = 0;
                e = queue.size();
                result.add(list);
                list = new ArrayList<>(queue.size());
            }
        }
        return result;
    }

