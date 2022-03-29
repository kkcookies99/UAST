 public int XXX(TreeNode root) {
 if (root == null) {
            return 0;
        }
        int depth=0;
        depth=Math.max(XXX(root.left),XXX(root.right))+1;
        return depth;
}

