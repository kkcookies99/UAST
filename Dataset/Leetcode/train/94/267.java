     public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        mindGetTree(root, list);
        return list;
    }

    private void mindGetTree(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        mindGetTree(root.left, list);
        list.add(root.val);
        mindGetTree(root.right, list);
    }

