 class Solution {
    TreeNode prev;
    public boolean XXX(TreeNode root) {
        return recur(root);
    }

    private boolean recur(TreeNode root) {
        if (root == null) return true;

        boolean left = recur(root.left);
        if (prev == null || root.val > prev.val) {
            prev = root;
        } else {
            return false;
        }

        boolean right = recur(root.right);
        return left && right;
    }
}

