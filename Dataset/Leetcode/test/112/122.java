public boolean XXX(TreeNode root, int targetSum) {
        return pathSum(root, targetSum, 0);
    }

    public boolean pathSum(TreeNode root, int targetSum, int result){
        if(root == null)
            return false;
        if(result + root.val == targetSum && root.left == null && root.right == null)
            return true;
        if(result + root.val > targetSum && root.left == null && root.right == null)
            return false;
        result += root.val;
        return pathSum(root.left, targetSum, result) || pathSum(root.right, targetSum, result);
    }

