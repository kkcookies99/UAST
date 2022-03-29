 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSym(root.left, root.right);

    }
    public boolean isSym(TreeNode left , TreeNode right){
        if ( left == null && right == null ){
            return true;
        }
        if ( left == null && right != null){
            return false;
        }
        if (left != null && right == null){
            return false;
        }
        return left.val == right.val && isSym(left.left,right.right) && isSym(left.right, right.left);
    }
}

