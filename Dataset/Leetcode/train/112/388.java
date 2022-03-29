 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if(root==null) return false;
        //叶子节点
        if(root.left==null && root.right==null) {
            return targetSum==root.val;
        }
        //非叶子节点
        if(XXX(root.left, targetSum-root.val)
            || XXX(root.right, targetSum-root.val)){
            return true;
        }
        return false;
    }
}

