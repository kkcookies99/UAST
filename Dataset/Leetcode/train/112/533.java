 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                return sum == root.val;
            }
            sum -= root.val;
            return XXX(root.left, sum) || XXX(root.right, sum);
        }
        return false;
    }
}

