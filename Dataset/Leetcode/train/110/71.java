class Solution {
    public boolean XXX(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(maxDep(root.right) - maxDep(root.left)) > 1) return false;
        return XXX(root.left) && XXX(root.right);
    }
    
    private int maxDep(TreeNode root) {return root == null ? 0 : Math.max(maxDep(root.left), maxDep(root.right)) + 1;}
}
