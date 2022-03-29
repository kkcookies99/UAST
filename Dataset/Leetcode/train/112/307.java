 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum-=root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        if (XXX(root.left, targetSum)) {
            return true;
        }
        if (XXX(root.right, targetSum)) {
            return true;
        }
        return false;
    }
}

