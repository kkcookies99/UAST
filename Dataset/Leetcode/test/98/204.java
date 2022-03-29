 class Solution {
    long prev = Long.MIN_VALUE;
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        boolean isLeft = XXX(root.left);
        if(root.val > prev) {
            prev = (long)root.val;
        }else{
            prev = Long.MIN_VALUE;
            return false;
        }
        boolean isRight = XXX(root.right);
        return isLeft && isRight;
    }
}

