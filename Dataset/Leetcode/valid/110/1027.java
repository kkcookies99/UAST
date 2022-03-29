 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getHeight(root.left) - getHeight(root.right)) < 2 && XXX(root.left) && XXX(root.right);
    }
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + getHeight(root.left), 1 + getHeight(root.right));
    }
}

