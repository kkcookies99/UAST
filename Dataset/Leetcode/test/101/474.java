 class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        return solve(root.left,root.right);
    }

    boolean solve(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return solve(left.left,right.right) && solve(left.right,right.left); 
     }
}

