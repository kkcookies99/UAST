public int XXX(TreeNode root) {
        return dfs(root);
    }
    public int dfs(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return dfs(root.right) + 1;
        else if (root.right == null) return dfs(root.left) + 1;
        else return Math.min(dfs(root.left), dfs(root.right)) + 1;
    }

