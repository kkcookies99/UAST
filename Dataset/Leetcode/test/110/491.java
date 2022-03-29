class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
      int left = helper(root.left,1);
      if(left==-1){
        return false;
      }
     int right = helper(root.right,1);
     if(right==-1){
        return false;
    }
     return Math.abs(left-right)<=1;
    }
      public int helper(TreeNode root,int index) {
          if(root==null){
              return index-1;
          }
          int left = helper(root.left,index+1);
          if(left==-1){
              return -1;
          }
          int right = helper(root.right,index+1);
             if(right==-1){
              return -1;
          }
          if(Math.abs(left-right)>1){
              return -1;
          }
          return Math.max(left,right);

      }

}

