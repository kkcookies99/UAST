 public boolean XXX(TreeNode root) {
        if(root == null ) return true;
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode p , TreeNode q)
    {
        if(p == null || q == null ) return p == null && q == null;
        return p.val == q.val && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
