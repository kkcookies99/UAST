 class Solution {
    public boolean XXX(TreeNode root, int sum) {
        if (root == null)
            return false;
        return recursion(root, sum);
    }

    public boolean recursion(TreeNode root, int sum) {
        if (root == null)
            return sum == 0;
        else if (root.left == null && root.right != null)
            return recursion(root.right, sum-root.val);
        else if (root.right == null && root.left != null)
            return recursion(root.left, sum-root.val);
        return recursion(root.left, sum-root.val) || recursion(root.right, sum-root.val);
    }
}

