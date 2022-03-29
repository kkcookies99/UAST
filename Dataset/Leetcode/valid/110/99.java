class Solution {
    public boolean XXX(TreeNode root) {
        return len(root) >= 0;
    }
    private int len(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLen = len(root.left);
        if (leftLen < 0) {
            return -1;
        }
        int rightLen = len(root.right);
        if (rightLen < 0) {
            return -1;
        }
        if (Math.abs(leftLen - rightLen) > 1) {
            return -1;
        }
        return Math.max(leftLen, rightLen) + 1;
    }
}

