 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return XXXCore(root.left, root.right);
    }

    private boolean XXXCore(TreeNode left, TreeNode right){
        if(left ==null && right == null) return true;
        if(left ==null || right == null) return false;
        if(left.val != right.val) return false;
        return XXXCore(left.left, right.right) && XXXCore(left.right, right.left);
    }
}

