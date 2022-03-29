 class Solution {
    public boolean XXX(TreeNode root, int targetSum) {
      
        if(root ==null){
            return false;
        }
        if(root.left == null && root.right ==null){          
            return targetSum == root.val;
        }
  
         if(root.left!=null && XXX(root.left ,targetSum -root.val)){
             return true;
         }
        
        if(root.right!=null &&  XXX(root.right ,targetSum -root.val)){
             return true;
        }
        return false;
    }
}

