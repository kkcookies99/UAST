    public List<List<Integer>> XXX(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> curr = new LinkedList<>();
        curr.add(root);
        while (!curr.isEmpty()) {
            List<TreeNode> next = new LinkedList<>();
            List<Integer> list = new LinkedList<>();
            for (TreeNode t : curr) {
                list.add(t.val);
                if (t.left != null) next.add(t.left);
                if (t.right != null) next.add(t.right);
            }
            res.add(list);
            curr = next;
        }
        return res;
    }

