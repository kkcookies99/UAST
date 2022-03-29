 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        XXXRes = false;
        helpHasPathSum(root, sum);
        return XXXRes;
    }

    private boolean XXXRes;

    private void helpHasPathSum(TreeNode root, int sum) {
        if (root == null) return;
        if (root.val == sum && root.left == null && root.right == null) {
            XXXRes = true;
            return;
        }
        helpHasPathSum(root.left, sum - root.val);
        if (XXXRes) return;
        helpHasPathSum(root.right, sum - root.val);
    }
}

