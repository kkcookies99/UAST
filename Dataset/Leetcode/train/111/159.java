class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = XXX(root.left) + 1;
        int right = XXX(root.right) + 1;
        if (root.left == null && root.right != null) {
            return right;
        }
        if (root.left != null && root.right == null) {
            return left;
        }
        return Math.min(left, right);
    }
}

