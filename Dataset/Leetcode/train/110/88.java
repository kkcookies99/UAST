class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right) > 1) return false;
           
        return XXX(root.left) && XXX(root.right);
    }
    
    private int getTreeHeight(TreeNode root) {
        if(root == null) return 0;
        return Math.max(getTreeHeight(root.left) + 1, getTreeHeight(root.right) + 1);
    }
}

