    public List<Integer> XXX(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        } 
        find(root, list);
        return list;
    }

    private static void find (TreeNode node, List<Integer> list) {
        if (node.left != null) {
            find(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            find(node.right, list);
        }
    }
}

