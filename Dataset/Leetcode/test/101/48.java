 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return inorder(root.left,root.right);
    }

    public boolean inorder(TreeNode left, TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val != right.val) return false;
        return inorder(left.left,right.right) && inorder(left.right,right.left);
    }
}

