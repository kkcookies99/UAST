     public boolean XXX(TreeNode root) {
        if (root == null) return true;
        return XXX(root, root);
    }
    
    public boolean XXX(TreeNode le, TreeNode ri) {
        if (le == null && ri == null) return true;
        if (le == null || ri == null) return false;
        return le.val == ri.val && 
            XXX(le.left, ri.right) && XXX(le.right, ri.left);
    }

