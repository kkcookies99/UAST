 class Solution {
    public boolean XXX(TreeNode root) {
        return leftRightCheckout(root.left,root.right);
    }

    public boolean leftRightCheckout(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val == right.val){
            return leftRightCheckout(left.left,right.right) && leftRightCheckout(left.right,right.left);
        }else{
            return false;
        }
    }
}

