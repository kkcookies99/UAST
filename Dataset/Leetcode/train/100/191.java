  public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        if (q == null) return false;

        boolean left = XXX(p.left, q.left);
        boolean right = XXX(p.right, q.right);

        /*后续遍历代码*/
        return left && right && p.val == q.val;
    }

