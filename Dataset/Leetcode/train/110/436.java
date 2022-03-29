    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return XXX(root, root);
    }
    
    private boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q.left == null && q.right == null) {
            return true;
        }
        if (q == null && p.left == null && p.right == null) {
            return true;
        }
        return XXX(p.left, p.right) && XXX(q.left, q.right);
    }

