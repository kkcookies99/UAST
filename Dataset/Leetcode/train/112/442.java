 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (null == root) return false;
        sum -= root.val;
        if (null == root.left && null == root.right) {
            return 0 == sum;
        }
        boolean ans = false;
        if (root.left != null) ans |= XXX(root.left, sum);
        if (root.right != null) ans |= XXX(root.right, sum);
        return ans;
    }
}

