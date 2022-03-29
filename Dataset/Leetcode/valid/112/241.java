 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
//        如果根节点为空直接返回false
        if(root == null){
            return false;
        }
//        如果当前结点值等于目标值且左右子树为空,则返回true
        if(targetSum == root.val && root.left == null && root.right == null){
            return true;
        }
//        对左子树和右子树进行递归查找,只要有一边符合条件即可,所以用或运算
        return XXX(root.left,targetSum - root.val) || 
               XXX(root.right,targetSum - root.val);
    }
}

