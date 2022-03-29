 class Solution {
    public boolean XXX(TreeNode root) {
        return helper(root, root);
    }

     public boolean helper(TreeNode leftRoot, TreeNode rightRoot) {
         if(leftRoot == null && rightRoot == null)
            return true;
         if(leftRoot == null || rightRoot == null)
            return false;
         if(leftRoot.val != rightRoot.val)
            return false;
        return helper(leftRoot.left, rightRoot.right) && helper(leftRoot.right, rightRoot.left);
    }
}

