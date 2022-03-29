 class Solution {
    public boolean XXX(TreeNode root) {
        if(root==null){
            return true;
        }
        return isequal(root.left,root.right);
    }
    public boolean isequal(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if(left==null||right==null||left.val!=right.val){
            return false;
        }
        else 
        return isequal(left.left,right.right)&&isequal(left.right,right.left);
    }
}

