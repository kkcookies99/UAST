class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
              return  true;
        }
        else
        {
             return   Math.abs(fun(root.left)-fun(root.right))<=1&&XXX(root.left)&&XXX(root.right); 
        }
    }
    public  int fun(TreeNode root){
         if(root==null){
               return  0;
         }
         else{
               return  Math.max(fun(root.left),fun(root.right))+1;
         }

    }
}

