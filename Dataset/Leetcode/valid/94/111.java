     public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorder(root, list);
    }

    private List<Integer> inorder(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
        return list;
    }

