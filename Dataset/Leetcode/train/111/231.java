    public int XXX(TreeNode root) {
        if (root == null) return 0;
        int m1 = XXX(root.left);
        int m2 = XXX(root.right);
        //左子树为空则返回右子树的深度+1
        return m1 == 0 || m2 == 0 ? m1 + m2 + 1 : Math.min(m1, m2) + 1;
    }

