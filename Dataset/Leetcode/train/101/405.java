 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null){
            return true;
        }
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return compare(left.right,right.left) && compare(left.left,right.right);
    }
}

