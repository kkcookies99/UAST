class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if (root == null) return false;

        int res = targetSum - root.val;
        if (res == 0 && root.left == null && root.right == null) return true;

        boolean leftSum = false;
        if (root.left != null){leftSum = XXX(root.left,res);}
        if (leftSum)return true;

        boolean rightSum = false;
        if (root.right != null){rightSum = XXX(root.right,res);}
        if (rightSum)return true;

        return false;

    }
  
}

