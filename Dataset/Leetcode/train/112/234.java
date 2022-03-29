 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        // 当前为叶子结点
        if (sum == 0 && root.left == null && root.right == null) {
            return true;
        }
        boolean left = XXX(root.left, sum);
        boolean right = XXX(root.right, sum);
        return left || right;
    }
}

