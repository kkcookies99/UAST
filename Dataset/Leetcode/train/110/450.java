class Solution {
    public boolean XXX(TreeNode root) {
        return getBlanceTreeHeight(root) != -1;
    }

    private int getBlanceTreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getBlanceTreeHeight(root.left);
        if (left == -1) {
            return -1;
        }
        int right = getBlanceTreeHeight(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}

