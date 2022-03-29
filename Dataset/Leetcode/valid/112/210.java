 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }

        int target = targetSum - root.val;
        return XXX(root.left, target) || XXX(root.right, target);
    }
}

