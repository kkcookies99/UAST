 class Solution {
    public boolean XXX(TreeNode root) {
        if (root==null){
            return true;
        }
        return isSame(root.left,root.right);
    }
    public boolean isSame(TreeNode left, TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if(left==null||right==null){
            return false;
        }else if(left.val!=right.val){
            return false;
        }else {
            return isSame(left.left,right.right)&&isSame(left.right,right.left);
        }
    }


