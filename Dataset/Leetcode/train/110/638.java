 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(findDepth(root.left,0)-findDepth(root.right,0))<=1){
            return  XXX(root.left)&&XXX(root.right);
        }
        return false;
    
    }
    
    public int findDepth(TreeNode node,int depth){
        if(node == null) return depth;
        ++depth;
        return Math.max(findDepth(node.left,depth),findDepth(node.right,depth));
    }
}

