 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return XXX(root.left,root.right);
    }

    public boolean XXX(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null && right != null) return false;
        if(left != null && right == null) return false;
        if(left.val != right.val) return false;
        return XXX(left.left, right.right) && 
            XXX(left.right,right.left);
    }
}

