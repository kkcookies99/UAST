class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        int rightDepth = depth(root.right);
        int leftDepth = depth(root.left);
        return Math.abs(leftDepth-rightDepth)>1 ? false:XXX(root.left)&&XXX(root.right);
    }
    public int depth(TreeNode root){
        if(root == null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}

