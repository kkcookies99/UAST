 class Solution {
    Integer prev;
    public boolean XXX(TreeNode root) {
        return digui(root);
    }
    public boolean digui(TreeNode root){
        if(root==null){
            return true;
        }
        if(!digui(root.left)){
            return false;
        }
        if(prev!=null&&root.val<=prev){
            return false;
        }
        prev=root.val;
        return digui(root.right);
    }
}

