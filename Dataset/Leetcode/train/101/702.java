 class Solution {
    public boolean XXX(TreeNode root) {
         return XXX(root,root);   
    }

     public boolean XXX(TreeNode root1,TreeNode root2){
         //左跟右   == 右跟左
            if(root1 == null && root2==null)
                   return true;
            if(root1==null||root2==null)
                    return false;
            return XXX(root1.left,root2.right)&&(root1.val == root2.val)&&XXX(root1.right,root2.left);
         
    }
}

