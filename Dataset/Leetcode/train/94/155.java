 public List<Integer> XXX(TreeNode root) {
    List<Integer> resList = new ArrayList<>();
    if (root == null) return resList;
    TreeNode cur = root;
    while (cur != null) {
        TreeNode mostRight = cur.left;
        if (mostRight != null) {
            while (mostRight.right != null && mostRight.right != cur)
                mostRight = mostRight.right;
            if (mostRight.right == null) {
                mostRight.right = cur;
                cur = cur.left;
                continue;
            } else {
                resList.add(cur.val);
                mostRight.right = null;
            }
        } else {
            resList.add(cur.val);
        }
        cur = cur.right;
    }
    return resList;
}

