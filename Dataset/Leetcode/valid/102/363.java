    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> all = new ArrayList<>();
        if (root == null) {
            return all;
        }
        Queue<TreeNode> a = new LinkedList<>();
        Queue<TreeNode> b = new LinkedList<>();
        a.add(root);
        List<Integer> list = new ArrayList<>();
        do {
            while (!a.isEmpty()) {
                TreeNode node = a.poll();
                if (node.left != null) {
                    b.add(node.left);
                }
                if (node.right != null) {
                    b.add(node.right);
                }
                list.add(node.val);
            }
            all.add(list);
            list = new ArrayList<>();
            a = b;
            b = new LinkedList<>();
        } while (!a.isEmpty());
        return all;
    }

