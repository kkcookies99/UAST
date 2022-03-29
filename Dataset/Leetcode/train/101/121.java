 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        return isS(root.left,root.right);
    }
    private boolean isS(TreeNode left,TreeNode right) {
        if(left==null&&right==null) return true;
        else if(left==null||right==null||left.val!=right.val) return false;
        return isS(left.left,right.right)&&isS(left.right,right.left);
    }
}

