 public List<Integer> XXX(TreeNode root) {
    List<Integer> listInter = new ArrayList<Integer>();
    if (root == null) {
		return listInter;
	}
	if (root.left != null) {
		listInter.addAll(XXX(root.left));
	}
	listInter.add(root.val);
	if (root.right != null) {
		listInter.addAll(XXX(root.right));
	}
	return listInter;
}

