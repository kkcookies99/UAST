 class Solution {
    private TreeNode pre=null;//记录中序遍历的前一个结点
    //中序遍历
    public boolean XXX(TreeNode root) {
       if(root == null) return true;
       boolean left = XXX(root.left);
       if(pre!=null && pre.val>=root.val){//存在降序
          pre=root;//pre继续向前
          return false;
       }
       pre = root;//pre继续向前
       boolean right = XXX(root.right);
       return (left && right);
    }
}

