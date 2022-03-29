class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null)    return true;
        return XXX(root.left) && XXX(root.right) && (Math.abs(maxHeight(root.left) - maxHeight(root.right)) <= 1);
    }
    
    private int maxHeight(TreeNode root){
        if(root == null)   return 0;
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }
}

