 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum -= root.val;
        if ((root.left == null) && (root.right == null))
            return (sum == 0);
        return XXX(root.left, sum) || XXX(root.right, sum);
    }
}

