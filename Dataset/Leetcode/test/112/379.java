 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return isPathEqual(root, 0, targetSum);
    }

    public boolean isPathEqual(TreeNode root, int currentSum, int targetSum){
        if(root == null && currentSum != targetSum){
            return false;
        }else if(root == null && currentSum == targetSum){
            return true;
        }
        if(root.val+currentSum == targetSum){
            if(root.left==null && root.right==null){
                return true;
            }else if(root.left==null){
                return isPathEqual(root.right, currentSum+root.val, targetSum);
            }else if(root.right==null){
                return isPathEqual(root.left, currentSum+root.val, targetSum);
            }else{
                return isPathEqual(root.left, currentSum+root.val, targetSum) || isPathEqual(root.right, currentSum+root.val, targetSum);
            }
        }else{
            return isPathEqual(root.left, currentSum+root.val, targetSum) || isPathEqual(root.right, currentSum+root.val, targetSum);
        }
    }
}

