 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;
        int sum = root.val;
        if (sum == targetSum && root.right == null && root.left == null) return true;
        return XXX(root.left, targetSum-sum) || XXX(root.right, targetSum-sum);
    }
}

