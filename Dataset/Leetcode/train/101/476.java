   public boolean XXX(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode tree1, TreeNode tree2){
        if (tree1 == null && tree2 == null) return true;
        if (tree1 == null || tree2 == null) return false;
        if (tree1.val != tree2.val) return false;
        return isMirror(tree1.right,tree2.left) && isMirror(tree2.right,tree1.left);
    }

