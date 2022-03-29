class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(level(root.left)-level(root.right)) > 1) return false;
        return XXX(root.left) && XXX(root.right);       
    }
    public int level(TreeNode root){
        if(root == null) return 0;
        return Math.max(level(root.left),level(root.right))+1;        
    }
}

