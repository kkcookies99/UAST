 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
       if(Math.abs(rec(root.left)-rec(root.right))>1){
           return false;
       }
       return XXX(root.left) && XXX(root.right);
    }
    public int rec(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(rec(node.left),rec(node.right))+1; 
    }
}

