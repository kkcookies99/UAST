  public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(high(root.left) - high(root.right)) > 1) {
            return false;
        }
        return XXX(root.left) && XXX(root.right);
    }

    public int high(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(high(root.left), high(root.right)) + 1;
    }
}

