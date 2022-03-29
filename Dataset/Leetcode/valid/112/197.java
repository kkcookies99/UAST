  public boolean XXX(TreeNode root, int targetSum) {
//        base case
        if(root == null ) return false;
        // 叶子节点进行判断
        else if( root.val - targetSum == 0 && root.left == null && root.right == null) return true;
//        判断逻辑
        return XXX(root.left, targetSum - root.val)
                || XXX(root.right, targetSum - root.val);
    }

