 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        return root == null ? false : (sum == root.val && root.left == null && root.right == null) || XXX(root.left,sum-root.val) || XXX(root.right,sum-root.val);
    }
}

