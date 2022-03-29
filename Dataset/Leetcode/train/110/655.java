 class Solution {
    public boolean XXX(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(getHeight(root.left)-getHeight(root.right))<=1) 
            return XXX(root.left) && XXX(root.right);
        else return false;
    }
    
    public int getHeight(TreeNode node){
        if(node==null)
            return 0;
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }
}

