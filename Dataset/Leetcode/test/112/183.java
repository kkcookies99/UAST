class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        targetSum=targetSum-root.val;
        if(targetSum==0&&root.left==null&&root.right==null)
            return true;
         return XXX(root.left,targetSum)||XXX(root.right,targetSum);   
    }
}

