 public boolean XXX(TreeNode root) {
        return Rec(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean Rec(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (low > high || root.val < low || root.val > high) return false;
        return Rec(root.left, low, root.val-1L) && Rec(root.right, root.val+1L, high);
    }

