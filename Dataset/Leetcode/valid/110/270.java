class Solution {
    public boolean XXX(TreeNode root) {
        return depth(root) >= 0;
    }

    private int depth(TreeNode n) {
        if (n == null) {
            return 0;
        }

        int l = depth(n.left);
        if (l < 0) {
            return -1;
        }

        int r = depth(n.right);
        if (r < 0) {
            return -1;
        }

        if (Math.abs(l - r) > 1) {
            return -1;
        }

        return Math.max(l, r) + 1;
    }
}

