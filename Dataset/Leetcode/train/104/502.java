public int XXX(TreeNode root) {
        if (root == null) return 0;
        return XXX(root, 1);
    }

    private int XXX(TreeNode root, int depth) {
        if (root == null) return depth;
        int dl = root.left == null ? depth : XXX(root.left, depth + 1);
        int dr = root.right == null ? depth : XXX(root.right, depth + 1);
        return Math.max(dl, dr);
    }

