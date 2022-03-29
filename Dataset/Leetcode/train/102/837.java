 public List<List<Integer>> XXX(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    traversal(root, res, 0);
    return res;
}

public void traversal(TreeNode root, List<List<Integer>> list, int height) {
    if (root == null) return;
    if (list.size() <= height) list.add(new ArrayList<>());

    list.get(height).add(root.val);
    height++;

    traversal(root.left, list, height);
    traversal(root.right, list, height);
}



