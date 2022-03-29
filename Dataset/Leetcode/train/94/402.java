 public List<Integer> XXX(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        mid(root, res);
        return res;
    }

    private void mid(TreeNode root, List<Integer> res) {
        if (root == null) return;
        mid(root.left, res);
        res.add(root.val);
        mid(root.right, res);
    }

