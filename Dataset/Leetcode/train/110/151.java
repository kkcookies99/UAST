class Solution {
    public boolean XXX(TreeNode root) {
        return isBalance(root) != -1;
    }

    private int isBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = isBalance(node.left);
        int r = isBalance(node.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
            return -1;
        }
        return Math.max(l, r) + 1;
    }
}

