 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        return isEqual(root.left,root.right);
      
    }
     public boolean isEqual(TreeNode left,TreeNode right){
         if(left==null){
             return right==null;
         }
         if(right==null){
             return false;
         }
         if(left.val!=right.val){
             return false;
         }
         return isEqual(left.left,right.right)&&isEqual(left.right,right.left);

     }
}

