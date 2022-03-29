  public boolean XXX(TreeNode root, int targetSum) {

        return pathSum(root,0,targetSum);
    }

    public boolean pathSum(TreeNode node,int tempSum,int targetSum) {

        if (node == null) return false;
        if (node.left == null && node.right == null){
            tempSum += node.val;
            return tempSum==targetSum;
        }
        else {
            return pathSum(node.left,tempSum+node.val,targetSum)||pathSum(node.right,tempSum+node.val,targetSum);
        }

    }


