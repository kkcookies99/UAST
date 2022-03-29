 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if (XXX(root.left) && XXX(root.right) && (Math.abs(deep(root.left) - deep(root.right)) <= 1)) return true;
        return false;
    }
    private int deep(TreeNode root){
        if(root == null) return 0;
        return Math.max(deep(root.left), deep(root.right)) + 1;
    }
}

