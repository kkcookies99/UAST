class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        } 
        if(Math.abs(depth(root.left)-depth(root.right))>1){
            return false;
        }
        return XXX(root.left)&&XXX(root.right);
    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}

