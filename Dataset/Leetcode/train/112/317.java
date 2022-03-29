 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (targetSum == root.val && root.left == null && root.right == null) {
            return true;
        }
        return XXX(root.left, targetSum - root.val) || 
                XXX(root.right, targetSum - root.val);
    }
}

