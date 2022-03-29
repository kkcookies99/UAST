class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(getBinaryHeight(root.left) - getBinaryHeight(root.right)) > 1) {
            return false;
        }
        if (!XXX(root.left)) {
            return false;
        }
        if (!XXX(root.right)) {
            return false;
        }
        return true;
    }

    private int getBinaryHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getBinaryHeight(root.left), getBinaryHeight(root.right)) + 1;
    }
}

