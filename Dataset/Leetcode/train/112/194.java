 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        return root == null ? false : root.left == null && root.right == null && root.val == targetSum ? true : (XXX(root.left, targetSum-root.val) || XXX(root.right, targetSum-root.val));
    }
}

