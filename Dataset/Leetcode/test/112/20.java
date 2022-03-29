class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        return hasSum(root, targetSum, 0);
    }

    private boolean hasSum(TreeNode node, int targetSum, int currSum) {
        if(node == null) return false;
        currSum += node.val;
        if(node.left == null && node.right == null) {
            return currSum == targetSum;
        }
        return hasSum(node.left, targetSum, currSum) || hasSum(node.right, targetSum, currSum);
    }
}

