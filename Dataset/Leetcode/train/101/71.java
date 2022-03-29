 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left, TreeNode right){
        if(left == right) return true;
        if(left == null || right == null) return false;
        return left.val == right.val 
                && compare(left.left,right.right) 
                && compare(left.right,right.left); 
    }
}

