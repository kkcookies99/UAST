class Solution {
    public boolean XXX(TreeNode root) {
      
        if(root == null){
            return true;
        }
        int left = help(root.left);
        int rigth = help(root.right);
        
        return Math.abs(left - rigth) <= 1 && XXX(root.left) &&  XXX(root.right) ;
        
    }
    
    public int help(TreeNode root){
        
        if(root == null){
            return 0;
        }
        int leftHeight = help(root.left);
        int rightHeight = help(root.right);
        
        
        return Math.max(leftHeight, rightHeight) + 1;
        
    }
    
}

