 class Solution {
    public boolean XXX(TreeNode root) {
        return help(root,root);
    }
    public boolean help(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left != null && right != null && left.val == right.val){
            return help(left.left,right.right) && help(left.right,right.left);
        }else{
            return false;
        }
    }
}

