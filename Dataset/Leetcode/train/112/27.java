class Solution {
    public boolean XXX(TreeNode root, int sum) {
        return sum(root, 0, sum);
    }
    private boolean sum(TreeNode root, int currSum, int target){
        if(root == null){
            return false;
        }
        currSum += root.val;
        if(root.left == null && root.right == null){
            return currSum == target;
        }
        return sum(root.left, currSum, target) || sum(root.right, currSum, target);
    }
}

