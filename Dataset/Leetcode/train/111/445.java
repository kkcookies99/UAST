class Solution {
    public int XXX(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left == null && root.right == null) {
                return 1;
            } else if (root.left == null || root.right == null) {
                return root.left != null ? XXX(root.left) + 1 : XXX(root.right) + 1;
            } else {
                return Math.min(XXX(root.left), XXX(root.right)) + 1;
            }
        }
    }
}
