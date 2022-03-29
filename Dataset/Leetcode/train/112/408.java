 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) return true;
        return XXX(root.left, sum-root.val) || XXX(root.right, sum-root.val);
    }
}

