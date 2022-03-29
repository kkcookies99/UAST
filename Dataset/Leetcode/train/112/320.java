 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        int currentSum = 0;
        return pathSum(root,targetSum,currentSum);
    }

    private boolean pathSum(TreeNode root, int targetSum,int currentSum){
        if(root == null){
            return false;
        }
        if(root.left != null || root.right != null){
            currentSum = currentSum + root.val;
        }else {
            if((currentSum + root.val) == targetSum){
                return true;
            }
        }
        if(pathSum(root.left,targetSum,currentSum)){
            return true;
        }
        if(pathSum(root.right,targetSum,currentSum)){
            return true;
        }else {
            return false;
        }
    }
}

