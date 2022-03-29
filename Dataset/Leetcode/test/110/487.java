class Solution {
    public boolean XXX(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(root, 1, res);
        return res[0];
    }

    public int getHeight(TreeNode root, int level, boolean[] res) {
        if (null == root) {
            return level;
        }

        int lh = getHeight(root.left, level + 1, res);
        if (!res[0]) {
            return level;
        }

        int rh = getHeight(root.right, level + 1, res);
        if (!res[0]) {
            return level;
        }

        if (Math.abs(lh - rh) > 1) {
            res[0] = false;
        }

        return Math.max(lh, rh);
    }
}

