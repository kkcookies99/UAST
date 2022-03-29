 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        return XXX(root.left,root.right);
    }
    public boolean XXX(TreeNode tree1,TreeNode tree2) {
        if(tree1 == null && tree2 == null ) return true;
        if(tree1 == null || tree2 == null || tree1.val != tree2.val) return false;
        return XXX(tree1.left,tree2.right) && XXX(tree1.right,tree2.left);
    }
}

