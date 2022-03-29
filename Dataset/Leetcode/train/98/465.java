 class Solution {
    boolean flag = true;
    int pre = Integer.MIN_VALUE;
    boolean first = true;
    public boolean XXX(TreeNode root) {
       
        inorder(root);
        return flag;
    }
    public  void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        if(root.val==Integer.MIN_VALUE&&first){
            first = false;
            pre = Integer.MIN_VALUE;
        }else if(root.val<=pre){
            flag = false;
            return;
        }else{
            pre = root.val;
            first = false;
        }
        inorder(root.right);

    }
}```

