 class Solution {
    public boolean XXX(TreeNode root) {
        
        // 镜像翻转 右子树 在对左右子树进行 遍历 如果值一样就返回
          if(root == null){
              return true;
          }
        if(root.left==null && root.right ==null){
            return true;
        }
        if(root.left == null || root.right == null){
            return false;
        }
         //镜像翻转右子树
        mirror(root.right);
       
       return isSame(root.left,root.right);
        
    }
    public void mirror(TreeNode root){
        //二叉树的镜像翻转
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            return ;
        }
        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        if(root.left !=null){
            mirror(root.left);
        }
        
         if(root.right != null){
            mirror(root.right);
        }
    }
    public boolean isSame(TreeNode left,TreeNode right){
       if(left==null && right ==null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right .val){
            return false;
        }
        
      
        return   isSame(left.right,right.right) && isSame(left.left,right.left);
        
    }
}

