 class Solution {
    public boolean XXX(TreeNode root) {
        if (null == root) return true;
        return helper(root.left, root.right);
    }
    private boolean helper(TreeNode left, TreeNode right){
        if (null == left && null == right) return true;
        if (null == left || null == right) return false;
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }
}


