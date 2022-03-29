public List<List<Integer>> XXX(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();
        r(root, res, 0);
        return res;
    }
    
      private void r(TreeNode node, List<List<Integer>> res, int level) {
        if (node == null)
            return;
        while (res.size() < level + 1) {
            res.add(new ArrayList<>());
        }
        List<Integer> list = res.get(level);
        list.add(node.val);

        r(node.left, res, level + 1);
        r(node.right, res, level + 1);
    }

