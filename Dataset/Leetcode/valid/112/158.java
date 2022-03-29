class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
        if( root == null) return false;
        //判断节点是否符合
        //结束循环的条件
        if(root.val == targetSum && root.left == null && root.right == null) return true;
        if (XXX(root.right, targetSum - root.val) || XXX(root.left, targetSum - root.val)) {
            return true;
        }
        return false;
    }
}

