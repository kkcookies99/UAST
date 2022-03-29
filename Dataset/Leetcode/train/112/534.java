 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null)
            return true;
        return XXX(root.left, sum) || XXX(root.right, sum);
    }
}

