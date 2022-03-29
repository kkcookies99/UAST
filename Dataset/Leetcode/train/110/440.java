 public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(heigh(root.left) - heigh(root.right)) > 1) return false;
        return XXX(root.left) && XXX(root.right);
    }

    private int heigh(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(heigh(root.left), heigh(root.right));
    }


