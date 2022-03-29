 class Solution {
    private int pre = -1;
    public boolean XXX(TreeNode root) {
        
       if(root==null)
         return true;        
        boolean left = XXX(root.left); 
        if(pre==-1){
            pre = root.val;
        }else{
            if(pre>=root.val){
                return false;
            }     
            pre = root.val;
        } 
       boolean right = XXX(root.right);
       return left && right;
    }
}

