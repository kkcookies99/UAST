 class Solution {
    public boolean XXX(TreeNode root) {
    //整个左子树小于根节点   整个右子树大于根节点
    long min = Long.MIN_VALUE,max = Long.MAX_VALUE;  
    return deep(root,min,max);
   }
    private boolean deep(TreeNode root,long min,long max){
      if(root == null)return true;
      if(root.val <= min)return false;  //小于最小值
      if(root.val >= max)return false;  //大于最大值
      return deep(root.left,min,root.val) && deep(root.right,root.val,max);
    }
}

