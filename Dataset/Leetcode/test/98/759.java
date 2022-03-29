 class Solution {
    public boolean XXX(TreeNode root) {
        return validate(root, new long[]{Long.MIN_VALUE});
    }
    private boolean validate(TreeNode root, long[]min) {
        if (root == null) {
            return true;
        }
        boolean left = validate(root.left, min);
        if (root.val <= min[0]) {
            return false;
        }
        min[0] = root.val;
        boolean right = validate(root.right, min);
        return left && right;
    }
}

