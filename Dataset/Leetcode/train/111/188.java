class Solution {
    public int XXX(TreeNode root) {
       if(root==null)return 0;
       if(root.left==null && root.right==null) return 1;
      
       int k=Integer.MAX_VALUE,g=Integer.MAX_VALUE;
       
       if(root.left!=null){
          k = XXX(root.left)+1;
       }
      
       if(root.right!=null){
         g = XXX(root.right)+1;
       }
     
       return k>g?g:k;
    }
}

